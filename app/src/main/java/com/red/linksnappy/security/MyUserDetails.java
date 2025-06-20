

package com.red.linksnappy.security;

import com.red.linksnappy.userManager.User;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author AlejandroRC
 */
public class MyUserDetails implements UserDetails {
    
    private User user; 
    private String role = "ROLE_USER";   
    
    public MyUserDetails(User user) {
        
    this.user = user;
    
}
    

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return List.of(new SimpleGrantedAuthority(this.role));

    }

    @Override
    public String getPassword() {

        return user.getPasswordHash();
        
    }

    @Override
    public String getUsername() {

        return user.getUserName();
        
    }

    @Override
    public boolean isAccountNonExpired() {
        
         return true;

    }

    @Override
    public boolean isAccountNonLocked() {

        return true;
        
    }

    @Override
    public boolean isCredentialsNonExpired() {

         return true;
        
    }

    @Override
    public boolean isEnabled() {

         return true;
        
    }
    
    
    
    
}
