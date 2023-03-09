
package com.CasoPractico1.repository;

import com.CasoPractico1.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends CrudRepository<Sala,Integer> {
    
}
