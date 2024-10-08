/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class Entrada {
    
    private int numero;
    private double precio;
    private String seccion;
    private Concierto concierto;
    private Espectador espectador;
    
    /*GETTERS Y SETTERS*/
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Concierto getConcierto() {
        return concierto;
    }

    public void setConcierto(Concierto concierto) {
        this.concierto = concierto;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
    
    
    /*CONSTRUCTOR POR DEFECTO*/
    public Entrada(int numero, double precio, String seccion, Concierto concierto, Espectador espectador) {
        this.numero = numero;
        this.precio = precio;
        this.seccion = seccion;
        this.concierto = concierto;
        this.espectador = espectador;
    }
    
    /*CONSTRUCTOR VACIO*/
    public Entrada() {
    }

    @Override
    public String toString() {
        return "Entrada{" + "numero=" + numero + ", precio=" + precio + ", seccion=" + seccion + ", concierto=" + concierto + ", espectador=" + espectador + '}';
    }
    
    
}
