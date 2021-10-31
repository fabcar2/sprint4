package com.example.apirest.modelos;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity
@Table(name="reserva")

public class ReservaModelo {
    
   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable = false)
      
    @Id
    private long id;
    private int identificacion;
    private int cancha;
    private Date fecha;
   // private Time hora;

 
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }



    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
  
  /*
    public Time getHora() {
        return hora;
    }
    public void setHora(Time hora) {
        this.hora = hora;
    }
*/
   
    public int getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getCancha() {
        return cancha;
    }
    public void setCancha(int cancha) {
        this.cancha = cancha;
    }
}
