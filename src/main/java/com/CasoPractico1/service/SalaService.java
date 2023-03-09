package com.CasoPractico1.service;

import com.CasoPractico1.entity.Sala;
import com.CasoPractico1.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService implements ISalaService{
    
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> getAllSalas() {
        return(List<Sala>)salaRepository.findAll();
    }

    @Override
    public void saveSala(Sala sala) {
        salaRepository.save(sala);
    }

    @Override
    public Sala getSalabyId(int id) {
        return salaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleleteSalaById(int id) {
         salaRepository.deleteById(id);
    }

    

    
    
}
