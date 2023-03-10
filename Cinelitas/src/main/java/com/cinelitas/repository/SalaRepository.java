
package com.cinelitas.repository;

import com.cinelitas.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando
 */
@Repository
public interface SalaRepository extends CrudRepository<Sala,Long>{
    
}
