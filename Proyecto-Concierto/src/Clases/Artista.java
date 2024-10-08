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
public class Artista {
    
    private String nombre;
    private String genero;
    private List<String> discografia;
    private List<Concierto> conciertos;
    
    /*GETTERS Y SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(List<String> discografia) {
        this.discografia = discografia;
    }

    public List<Concierto> getConciertos() {
        return conciertos;
    }

    public void setConciertos(List<Concierto> conciertos) {
        this.conciertos = conciertos;
    }
    
    /*CONSTRUCTOR POR DEFECTO*/
    public Artista(String nombre, String genero, List<String> discografia) {
        this.nombre = nombre;
        this.genero = genero;
        this.discografia = discografia;
        this.conciertos = conciertos;
    }
    
    /*CONSTRUCTOR VACIO*/
    public Artista() {
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + ", discografia=" + discografia + ", conciertos=" + conciertos + '}';
    }
    
    
    
}
