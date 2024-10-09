/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class Escenario {
 
    private String tamaño;
    private String equipamiento;
    // Similar al Técnico, el Escenario no tiene una asociación directa en este diagrama simplificado.
    // Si se quisiera agregar una relación, por ejemplo, con un Lugar (un escenario está en un lugar), se añadiría aquí.

    /*GETTERS Y SETTERS*/
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    /*CONSTRUCTOR POR DEFECTO*/
    public Escenario(String tamaño, int par, String equipamiento) {
        this.tamaño = tamaño;
        this.equipamiento = equipamiento;
    }
    
    /*CONSTRUCTOR VACIO*/
    public Escenario() {
    }

    @Override
    public String toString() {
        return "Escenario{" + "tama\u00f1o=" + tamaño + ", equipamiento=" + equipamiento + '}';
    }
    
    
    
}
