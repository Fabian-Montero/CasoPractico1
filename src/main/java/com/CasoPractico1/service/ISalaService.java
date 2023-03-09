package com.CasoPractico1.service;

import com.CasoPractico1.entity.Sala;
import java.util.List;

public interface ISalaService {
    public List<Sala> getAllSalas();
    
    public void saveSala(Sala sala);
    
    public Sala getSalabyId(int id);
    
    public void deleleteSalaById(int id);
    
    
    
}
