package com.example.apirest.controlador;
import java.util.ArrayList;
import java.util.Optional;

import com.example.apirest.modelos.ReservaModelo;
import com.example.apirest.servicios.ReservaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reserva")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})



public class ReservaControlador {
    @Autowired
    ReservaServicio reservaServicio;

    @PostMapping
    public ReservaModelo guardarReserva(@RequestBody ReservaModelo reserva){
        return reservaServicio.guardarReserva(reserva);
    }

    @GetMapping
    public ArrayList<ReservaModelo> obtenerReservas(){
        return reservaServicio.obtenerReservas();
    }

    @GetMapping(path = "/{identificacion}")
    public Optional<ReservaModelo> consultarReserva(@PathVariable("identificacion") Long identificacion){
        return this.reservaServicio.consultarReserva(identificacion);
    }

    @DeleteMapping(path="/{identificacion}")
    public String eliminarReserva(@PathVariable("identificacion") Long identificacion){
        boolean estado= this.reservaServicio.eliminarReserva(identificacion);
        if(estado){
            return "Se elimino la reserva  con identificacion "+identificacion;
        }
        else{
            return "No se pudo eliminar el reserva "+identificacion;
        }
    }
    
}
