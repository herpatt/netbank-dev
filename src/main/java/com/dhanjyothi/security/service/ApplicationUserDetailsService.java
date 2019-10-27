package com.dhanjyothi.security.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dhanjyothi.model.User;
import com.dhanjyothi.security.dao.UserDao;


@Service("userDetailsService")
@Transactional
public class ApplicationUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;
    
    public ApplicationUserDetailsService() {
        super();
    }    

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        try {
            final User user = userDao.findByUserName(username);
            if (user == null) {
                return new UserPrincipal(" ", " ", true, true, true, true,
                        (Collection<GrantedAuthority>) getAuthorities(null));
            }
            return new UserPrincipal(user.getUserName(), user.getPassword(), "A".equals(user.getUserStatus()), true, true, true,
                    (Collection<GrantedAuthority>) getAuthorities(user.getUserRole()));
        } catch (final Exception e) {
            throw new UsernameNotFoundException("User not exist!", e);
        }
    }

    public final Collection<? extends GrantedAuthority> getAuthorities(String userRole) {
    	String role = "ROLE_";
    	if( "M".equals(userRole) ) {
    		role += "MANAGER";
        } else if( "C".equals(userRole) ) {
        	role += "CUSTOMER";
        } else {
        	role += "ANONYMOUS";
        }
        return AuthorityUtils.createAuthorityList(role);
    }
}