

package com.red.linksnappy.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

/**
 *
 * @author AlejandroRC
 */

@Configuration
public class SecurityConfig {
    
    @Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf
            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
        ) // CSRF habilitado y accesible desde el frontend
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/login", "/register", "/profile", "/setting", "/admin", "/style/**", "/js/**").permitAll() // rutas públicas
            .anyRequest().authenticated() // el resto requiere autenticación
        );
    return http.build();
}

    
    
}
