

package com.red.linkSnappy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.red.linksnappy.userManager.User; 
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author AlejandroRC
 */
public interface UserRepository extends JpaRepository<User, Long> { 
    
    Optional<User> findByUserName(String userName);
    
    Optional<User> findByLastName( String lastName );
    
    Optional<User> findByBirthdate( LocalDate birthdate );
    
    Optional<User> findByEmail( String email);
    
    Optional<User> findByPasswordHash(String passwordHash);
    
    Optional<User> findByProfilePicture( String profilePicture );
            
    Optional<User> findByAddress( String address);
            
    Optional<User> findByCreatedAt( LocalDate createdAt);

    List<User> findByUserNameContainingIgnoreCase(String query); 
            
   
    
}
