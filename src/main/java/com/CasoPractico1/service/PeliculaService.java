package com.CasoPractico1.service;

import com.CasoPractico1.entity.Pelicula;
import com.CasoPractico1.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService implements IPeliculaService{
    
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPeliculas() {
        return(List<Pelicula>)peliculaRepository.findAll();
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula getPeliculaById(int id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleletePeliculaById(int id) {
        peliculaRepository.deleteById(id);
    }
}
