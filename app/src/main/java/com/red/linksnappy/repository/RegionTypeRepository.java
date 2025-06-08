

package com.red.linksnappy.repository;

import com.red.linksnappy.userManager.RegionType;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlejandroRC
 */
public interface RegionTypeRepository extends JpaRepository<RegionType, Byte > {
    
    Optional<RegionType> findByName( String name );
    
    
    
}
