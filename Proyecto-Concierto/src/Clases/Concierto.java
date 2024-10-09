/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Lenovo
 */
public class Concierto {
    
    private String nombre;
    private Date fecha;
    private Date hora;
    private String lugar;
    private Lugar ubicacion;
    private List<Artista> artista;
    private List<Entrada> entrada;
    private List<Patrocinador> patrocinador;
    private List<Espectador> espectador;
    
    /*GETTERS Y SETTERS*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Lugar getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Lugar String) {
        this.ubicacion = String;
    }

    public List<Artista> getArtista() {
        return artista;
    }

    public void setArtista(List<Artista> artista) {
        this.artista = artista;
    }

    public List<Entrada> getEntrada() {
        return entrada;
    }

    public void setEntrada(List<Entrada> entrada) {
        this.entrada = entrada;
    }

    public List<Patrocinador> getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(List<Patrocinador> patrocinador) {
        this.patrocinador = patrocinador;
    }
    
    public List<Espectador> getEspectador() {
        return espectador;
    }

    public void setEspectador(List<Espectador> espectador) {
        this.espectador = espectador;
    }    
    /*FIN DE GETTERS Y SETTERS*/
    
    /*CONSTRUCTOR POR DEFECTO*/
    public Concierto(String nombre, String lugar, Lugar ubicacion) {
        this.nombre = nombre;
        this.fecha = new Date(); 
        this.hora = new Date();  
        this.lugar = lugar;
        this.ubicacion = ubicacion;
        this.artista = new ArrayList<>(); 
        this.entrada = new ArrayList<>(); 
        this.patrocinador = new ArrayList<>();
        this.espectador = new ArrayList<>();
    }
    
    /*CONSTRUCTOR VACIO*/
    public Concierto() {
    }

    @Override
    public String toString() {
        return "Concierto{" + "nombre=" + nombre + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + ", site=" + ubicacion + ", artista=" + artista + ", entrada=" + entrada + ", patrocinador=" + patrocinador + '}';
    }

    

    

}
