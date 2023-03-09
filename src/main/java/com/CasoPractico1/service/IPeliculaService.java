package com.CasoPractico1.service;

import com.CasoPractico1.entity.Pelicula;
import java.util.List;

public interface IPeliculaService {
    
    public List<Pelicula> getAllPeliculas();
    
    public void savePelicula(Pelicula pelicula);
    
    public Pelicula getPeliculaById(int id);
    
    public void deleletePeliculaById(int id);
    
}
