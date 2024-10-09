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
public class Espectador {
    
    private String nombre;
    private String edad;
    private String correo;
    private List<Entrada> entradas;
    
    /*GETTERS Y SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }
    /*FIN DE GETTERS Y SETTERS*/
    
    /*CONSTRUCTOR POR DEFECTO*/
    public Espectador(String nombre, String edad, String correo, List<Entrada> entradas) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.entradas = entradas;
    }
    
    /*CONSTRUCTOR VACIO*/
    public Espectador() {
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", entradas=" + entradas + '}';
    }
    
    
    
}
