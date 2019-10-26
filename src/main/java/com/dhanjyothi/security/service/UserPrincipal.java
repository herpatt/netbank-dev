package com.dhanjyothi.security.service;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

public class UserPrincipal extends org.springframework.security.core.userdetails.User {

    private static final long serialVersionUID = -6117048449037467267L;

    public UserPrincipal(String username, String password, boolean enabled, boolean accountNonExpired,boolean credentialsNonExpired, boolean accountNonLocked,Collection<GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired,accountNonLocked, authorities);
    }
}