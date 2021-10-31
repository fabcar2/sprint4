package com.example.apirest.modelos;

import javax.persistence.*;

@Entity
@Table(name="usuario")

public class UsuarioModelo {

    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable = false)
    @Id
    private long id;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private int identificacion;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    
}
