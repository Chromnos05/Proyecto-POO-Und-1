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
public class Patrocinador {
    
    private String nombre;
    private String contacto;
    private List<Concierto> conciertos;
    
    /*GETTERS Y SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public List<Concierto> getConciertos() {
        return conciertos;
    }

    public void setConciertos(List<Concierto> conciertos) {
        this.conciertos = conciertos;
    }
    
    /*CONSTRUCTOR POR DEFECTO*/
    public Patrocinador(String nombre, String contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.conciertos = conciertos;
    }
    
    /*CONSTRUCTOR VACIO*/

    public Patrocinador() {
    }

    @Override
    public String toString() {
        return "Patrocinador{" + "nombre=" + nombre + ", contacto=" + contacto + ", conciertos=" + conciertos + '}';
    }
    
    
    
}
