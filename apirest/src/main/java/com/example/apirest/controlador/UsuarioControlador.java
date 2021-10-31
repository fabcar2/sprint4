package com.example.apirest.controlador;

import java.util.ArrayList;
import java.util.Optional;

import com.example.apirest.modelos.UsuarioModelo;
import com.example.apirest.servicios.UsuarioServicio;

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
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
public class UsuarioControlador {

    @Autowired
    UsuarioServicio usuarioServicio;

    @PostMapping
    public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuario){
        return usuarioServicio.guardarUsuario(usuario);
    }

    @GetMapping
    public ArrayList<UsuarioModelo> obtenerUsuarios(){
        return usuarioServicio.obtenerUsuarios();
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModelo> consultarUsuario(@PathVariable("id") Long id){
        return this.usuarioServicio.consultarUsuario(id);
    }

    @DeleteMapping(path="/{id}")
    public String eliminarUsuario(@PathVariable("id") Long id){
        boolean estado= this.usuarioServicio.eliminarUsuario(id);
        if(estado){
            return "Se elimino la reserva  con id "+id;
        }
        else{
            return "No se pudo eliminar el usuario "+id;
        }
    }
    
}
