package com.example.apirest.respositorio;

import com.example.apirest.modelos.UsuarioModelo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UsuarioModelo,Long>{
    
    
}
