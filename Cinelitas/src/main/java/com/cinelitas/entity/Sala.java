
package com.cinelitas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Fernando
 */
@Entity
@Table(name = "sala")
public class Sala implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long num_sala;
    
    private String max_personas;
    private String nombre;

    public long getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(long num_sala) {
        this.num_sala = num_sala;
    }

    public String getMax_personas() {
        return max_personas;
    }

    public void setMax_personas(String max_personas) {
        this.max_personas = max_personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
