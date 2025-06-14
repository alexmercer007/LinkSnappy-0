

package com.red.linksnappy.service;

import com.red.linkSnappy.repository.UserRepository;
import com.red.linksnappy.userManager.User;
import java.util.Collections;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author AlejandroRC
 */
@Service
public class MyUserDetailsService implements UserDetailsService { 

    private final UserRepository userRepository;

    public MyUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Supón que tu entidad User tiene los campos username y password
        User user = userRepository.findByUserName(username)
            .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        return new org.springframework.security.core.userdetails.User(
            user.getUserName(),
            user.getPasswordHash(),
            Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")) // O tus roles reales
        );
    }
}
