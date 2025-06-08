

package com.red.linksnappy.repository;

import com.red.linksnappy.userManager.Profession;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlejandroRC
 */
public interface ProfessionRepository extends JpaRepository<Profession, Long> {
    
    Optional<Profession> findByTypeId( Byte typeId);
    
    Optional<Profession> findByNameProfession( String nameProfession );
    
    
    
    
}
