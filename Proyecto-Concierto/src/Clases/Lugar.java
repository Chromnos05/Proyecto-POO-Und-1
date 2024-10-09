/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Lugar {
    
    private String nombre;
    private int capacidad;
    private String ubicacion;
    private List<Concierto> conciertos;

    
    /*GETTERS Y SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Concierto> getConciertos() {
        return conciertos;
    }

    public void setConciertos(List<Concierto> conciertos) {
        this.conciertos = conciertos;
    }

    /*CONSTRUCTOR POR DEFECTO*/
    public Lugar(String nombre, int capacidad, String ubicacion) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.conciertos = conciertos;
    }

    /*CONSTRUCTOR VACIO*/
    public Lugar() {
    }

    @Override
    public String toString() {
        return "Lugar{" + "nombre=" + nombre + ", capacidad=" + capacidad + ", direccion=" + ubicacion + ", conciertos=" + conciertos + '}';
    }
    
    
    
}
