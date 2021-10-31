package com.example.apirest.respositorio;
import com.example.apirest.modelos.ReservaModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ReservaRepo extends CrudRepository<ReservaModelo,Long>{
    
    
}