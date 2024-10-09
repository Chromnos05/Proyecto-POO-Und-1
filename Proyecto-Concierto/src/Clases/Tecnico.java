/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class Tecnico {
    
    private String nombre;
    private String especialidad;
    private int años_experiencia;
    // En este caso, el Técnico no tiene una asociación directa con otra clase en este diagrama simplificado.
    // Si se quisiera agregar una relación, por ejemplo, con un Concierto (un técnico trabaja en un concierto), se añadiría aquí.

    /*GETTERS Y SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }

    /*CONSTRUCTOR POR DEFECTO*/
    public Tecnico(String nombre, String especialidad, int años_experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.años_experiencia = años_experiencia;
    }
    
    /*CONSTRUCTOR VACIO*/
    public Tecnico() {
    }

    @Override
    public String toString() {
        return "Tecnico{" + "nombre=" + nombre + ", especialidad=" + especialidad + ", a\u00f1os_experiencia=" + años_experiencia + '}';
    }
    
    
    
}
