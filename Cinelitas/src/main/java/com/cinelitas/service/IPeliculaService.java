
package com.cinelitas.service;

import com.cinelitas.entity.Pelicula;
import java.util.List;

/**
 *
 * @author Fernando
 */
public interface IPeliculaService {
    public List<Pelicula> getAllPelicula();
    public Pelicula getPeliculaById (long id);
    public void savePelicula (Pelicula pelicula);
    public void delete (long id);
}
