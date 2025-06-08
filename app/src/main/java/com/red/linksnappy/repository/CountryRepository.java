

package com.red.linkSnappy.repository;

import com.red.linksnappy.userManager.Country;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlejandroRC
 */
public interface  CountryRepository extends JpaRepository<Country, Long> {
    
    Optional<Country> findByCountryId( Long countryId);
    
    Optional<Country> findByCountry( String country);
    
    
}
