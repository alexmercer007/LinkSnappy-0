
package com.red.linksnappy.repository;

import com.red.linksnappy.userManager.Region;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlejandroRC
 */
public interface RegionRepository extends JpaRepository<Region,Long> {
    
    Optional<Region> findByName( String name ); 
    Optional<Region> findByTypeId( Byte typeid ); 
    Optional<Region> findByCountryId( Long countryid ); 
    
}
