/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecucion;

import Clases.Artista;
import Clases.Concierto;
import Clases.Entrada;
import Clases.Escenario;
import Clases.Espectador;
import Clases.Lugar;
import Clases.Patrocinador;
import Clases.Tecnico;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lugar lugar = new Lugar("Estadio Olimpico", 80000, "Avenida de los Deportes 123"); // instanciar objeto de clase lugar
        Concierto concierto1 = new Concierto("Festival de Musica", "2023-12-25 20:00", lugar ); //Instanciar objeto de clase 
        
        /*CREACION DE ARTISTAS*/
        Artista artista1 = new Artista("Los Electricos", "Rock", List.of("Electrico", "Rock and Roll")); 
        Artista artista2 = new Artista("La Banda del Barrio", "Cumbia", List.of("Fiesta", "Carnaval")); 
        
        /*CREACION DE PATROCINADORES*/
        Patrocinador patrocinador1 = new Patrocinador("Coca-Cola", "##########");
        Patrocinador patrocinador2 = new Patrocinador("Adidas", "#########");
        
        /*AGREGACION DE ARTISTAS A LA LISTA*/
        concierto1.getArtista().add(artista1);
        concierto1.getArtista().add(artista2);
        
        /*AGREGACION DE PATROCINADORES A LA LISTA*/
        concierto1.getPatrocinador().add(patrocinador1);
        concierto1.getPatrocinador().add(patrocinador2);
        
        // Mostrar información del concierto
        System.out.println("Concierto:");
        System.out.println("Nombre: " + concierto1.getNombre());
        System.out.println("Hora: " + concierto1.getHora());
        System.out.println("Lugar: " + concierto1.getUbicacion().getNombre());
        System.out.println("Artistas:");
        
        for(Artista artista : concierto1.getArtista()) {
            System.out.println("- " + artista.getNombre());
        }
        System.out.println("");
        System.out.println("Patrocinadores:");
        for(Patrocinador patrocinador : concierto1.getPatrocinador()) {
            System.out.println("- " + patrocinador.getNombre());
        }
        
    }
}
