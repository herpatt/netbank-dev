<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page isELIgnored="false"%>
<%
	String region = System.getProperty("spring.profiles.active");
    boolean isDevelopment = "dev".equals(region) ? true : false;

    String baseURL = "/netbank-dev";
    
    String jsURL = baseURL + "/resources/static/js";
    String cssURL = baseURL + "/resources/static/css";
    String imageURL = baseURL + "/resources/static/images";
%>