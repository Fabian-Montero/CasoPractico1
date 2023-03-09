package com.CasoPractico1.repository;

import com.CasoPractico1.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula,Integer> {
    
}
