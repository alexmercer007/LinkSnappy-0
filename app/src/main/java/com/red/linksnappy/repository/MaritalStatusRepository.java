

package com.red.linksnappy.repository;

import com.red.linksnappy.userManager.MaritalStatus;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlejandroRC
 */
public interface MaritalStatusRepository extends JpaRepository<MaritalStatus,Long> {
    
    
    
}
