

package com.red.linksnappy.repository;

import com.red.linksnappy.userManager.ProfessionType;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlejandroRC
 */
public interface ProfessionTypeRepository extends JpaRepository <ProfessionType, Byte> { 
    
    Optional<ProfessionType> findByName( String name);
    
    
    
    
}
