package com.example.apirest.servicios;

import java.util.ArrayList;
import java.util.Optional;

import com.example.apirest.modelos.UsuarioModelo;
import com.example.apirest.respositorio.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    UserRepo userRepo;

    //metodo para guardar un usuario
    public UsuarioModelo guardarUsuario(UsuarioModelo usuario){
        return userRepo.save(usuario);
    }

    //metodo para devolver todos los registros de la bd
    public ArrayList<UsuarioModelo> obtenerUsuarios(){
        return (ArrayList<UsuarioModelo>) userRepo.findAll();
    }

    public Optional<UsuarioModelo> consultarUsuario(Long id){
        return userRepo.findById(id);
    } 

    public boolean eliminarUsuario(Long id){
        try{
            userRepo.deleteById(id);
            return true;
        }catch(Exception error){
            return false;
        }
    }

    
}
