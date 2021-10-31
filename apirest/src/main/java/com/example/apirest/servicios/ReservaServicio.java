package com.example.apirest.servicios;

import java.util.ArrayList;
import java.util.Optional;

import com.example.apirest.modelos.ReservaModelo;
import com.example.apirest.respositorio.ReservaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServicio { 
    @Autowired
    ReservaRepo reservaRepo;

    //metodo para guardar un usuario
    public ReservaModelo guardarReserva(ReservaModelo reserva){
        return reservaRepo.save(reserva);
    }

    //metodo para devolver todos los registros de la bd
    public ArrayList<ReservaModelo> obtenerReservas(){
        return (ArrayList<ReservaModelo>) reservaRepo.findAll();
    }

    public Optional<ReservaModelo> consultarReserva(Long identificacion){
        return reservaRepo.findById(identificacion);
    } 

    public boolean eliminarReserva(Long identificacion){
        try{
            reservaRepo.deleteById(identificacion);
            return true;
        }catch(Exception error){
            return false;
        }
    }

    
}
