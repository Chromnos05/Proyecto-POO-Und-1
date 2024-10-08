/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

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
    private Lugar String;
    private List<Artista> artista;
    private List<Entrada> entrada;
    private List<Patrocinador> patrocinador;
    
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

    public Lugar getSite() {
        return String;
    }

    public void setSite(Lugar String) {
        this.String = String;
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
    /*FIN DE GETTERS Y SETTERS*/
    
    /*CONSTRUCTOR POR DEFECTO*/
    public Concierto(String nombre, String lugar, Lugar site) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.String = String;
        this.artista = artista;
        this.entrada = entrada;
        this.patrocinador = patrocinador;
    }
    
    /*CONSTRUCTOR VACIO*/
    public Concierto() {
    }

    @Override
    public String toString() {
        return "Concierto{" + "nombre=" + nombre + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + ", site=" + String + ", artista=" + artista + ", entrada=" + entrada + ", patrocinador=" + patrocinador + '}';
    }


   
}
