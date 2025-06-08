

package com.red.linksnappy.repository;

import com.red.linksnappy.userManager.Messages;
import com.red.linksnappy.userManager.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlejandroRC
 */
public interface MessagesRepository extends JpaRepository <Messages, Long> {
    
    Optional<Messages> findByImage( String image );
    
    Optional<Messages> findByVideo( String video );
    
    List<Messages> findBySender( User sender );
    
    List<Messages> findByReceiver( User receiver );
    
    
    
}
