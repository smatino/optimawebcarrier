/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/security/UserDetailsServiceImpl.p.vm.java
 */
package com.optima.opticarrier.security;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Collection;
import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.optima.opticarrier.context.UserWithId;

/**
 * An implementation of Spring Security's {@link UserDetailsService}.
 * 
 * @see http://static.springsource.org/spring-security/site/reference.html
 */
@Singleton
@Named("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    /**
     * Retrieve an account depending on its login this method is not case sensitive.
     *
     * @param username the user's username
     * @return a Spring Security userdetails object that matches the username
     * @throws UsernameNotFoundException when the user could not be found
     * @throws DataAccessException when an error occurred while retrieving the account
     */
    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new UsernameNotFoundException("Empty username");
        }
        log.debug("Security verification for user '{}'", username);

        if ("user".equals(username)) {
            String password = "user";
            boolean enabled = true;
            boolean accountNonExpired = true;
            boolean credentialsNonExpired = true;
            boolean accountNonLocked = true;
            List<String> roles = newArrayList("ROLE_USER");
            return new UserWithId(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, toGrantedAuthorities(roles), null);
        }
        if ("admin".equals(username)) {
            String password = "admin";
            boolean enabled = true;
            boolean accountNonExpired = true;
            boolean credentialsNonExpired = true;
            boolean accountNonLocked = true;
            List<String> roles = newArrayList("ROLE_ADMIN");
            return new UserWithId(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, toGrantedAuthorities(roles), null);
        }
        return null;
    }

    private Collection<GrantedAuthority> toGrantedAuthorities(List<String> roles) {
        List<GrantedAuthority> result = newArrayList();
        for (String role : roles) {
            result.add(new SimpleGrantedAuthority(role));
        }
        return result;
    }
}