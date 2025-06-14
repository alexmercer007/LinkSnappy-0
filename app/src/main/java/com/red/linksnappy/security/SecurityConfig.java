

package com.red.linksnappy.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

/**
 *
 * @author AlejandroRC
 */

@Configuration
@EnableWebSecurity 
public class SecurityConfig {
    
     private final UserDetailsService userDetailsService;

    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
    
    
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf
            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
        ) // CSRF habilitado y accesible desde el frontend
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/login", "/register", "/style/**", "/js/**").permitAll() // rutas públicas
            .requestMatchers("/admin/**").hasRole("ADMIN")  // ejemplo de ruta protegida solo admin
            .anyRequest().authenticated() // el resto requiere autenticación
        );
    return http.build();
}

   @Bean
    public PasswordEncoder passwordEncoder() {
        
        return new BCryptPasswordEncoder();
        
    } 
    
}
