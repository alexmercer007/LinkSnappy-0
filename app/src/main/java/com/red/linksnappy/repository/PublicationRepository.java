

package com.red.linksnappy.repository;

import com.red.linksnappy.userManager.Publication;
import java.time.LocalDate;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlejandroRC
 */


public interface PublicationRepository extends JpaRepository<Publication, Long> {
    
    Optional<Publication> findByUserId( Long userId);
    
    Optional<Publication> findByContent( String content );
    
    Optional<Publication> findByImageUrl( String imageUrl );
    
    Optional<Publication> findByImageSrc( String imageSrc );
    
    Optional<Publication> findByVideoUrl( String videoSrc );
    
    Optional<Publication> findByVideoSrc( String imageSrc );
    
    Optional<Publication> findByPublicationDate( LocalDate publicationDate );
    
    
}
