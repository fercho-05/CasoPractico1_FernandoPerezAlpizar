
package com.cinelitas.repository;

import com.cinelitas.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fernando
 */
@Repository 
public interface PeliculaRepository extends CrudRepository<Pelicula,Long>{
    
}
