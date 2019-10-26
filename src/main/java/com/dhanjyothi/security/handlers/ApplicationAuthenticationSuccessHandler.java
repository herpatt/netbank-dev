package com.dhanjyothi.security.handlers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;

public class ApplicationAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	public void onAuthenticationSuccess(final HttpServletRequest request, final HttpServletResponse response,
			final Authentication authentication) throws IOException {
		handle(request, response, authentication);
		final HttpSession session = request.getSession(false);
		if (session != null) {
			session.setMaxInactiveInterval(30 * 60);
		}
		clearAuthenticationAttributes(request);
	}

	protected void handle(final HttpServletRequest request, final HttpServletResponse response,
			final Authentication authentication) throws IOException {
		final String targetUrl = determineTargetUrl(request);
		if (response.isCommitted()) {
			logger.debug("Response has already been committed. Unable to redirect to " + targetUrl);
			return;
		}
		redirectStrategy.sendRedirect(request, response, targetUrl);
	}

	public boolean hasClientRole(final HttpServletRequest request) {
		return request.isUserInRole("ROLE_CLIENT");
	}

	public boolean hasAdminRole(final HttpServletRequest request) {
		return request.isUserInRole("ROLE_ADMIN");
	}

	public boolean hasDealerRole(HttpServletRequest request) {
		return request.isUserInRole("ROLE_DEALER");
	}

	public boolean hasRole(String rolePermissionCode) {
		return false;
	}

	protected String determineTargetUrl(final HttpServletRequest request) {
		String redirectPage = "/login";
		SecurityContextHolderAwareRequestWrapper securityContextHolderWrapper = new SecurityContextHolderAwareRequestWrapper(
				request, "");
		if (hasClientRole(securityContextHolderWrapper)) {
			redirectPage = "/home";
		} else if (hasAdminRole(securityContextHolderWrapper)) {
			redirectPage = "/admin/home";
		} else if (hasDealerRole(securityContextHolderWrapper)) {
			redirectPage = "/dealer/home";
		}
		return redirectPage;
	}

	public void setRedirectStrategy(final RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}

	protected RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}
}