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
        
        Lugar lugar1 = new Lugar("Estadio Olímpico", 80000, "Avenida de los Deportes 123");
        Artista artista1 = new Artista("Los Eléctricos", "Rock", List.of("Eléctrico", "Rock and Roll"));
        Artista artista2 = new Artista("La Banda del Barrio", "Cumbia", List.of("Fiesta", "Carnaval"));
        Concierto concierto1 = new Concierto("Festival de Música", "2023-12-25 20:00", lugar1);

        // Establecer relaciones
        concierto1.getArtista().add(artista1);
        concierto1.getArtista().add(artista2);

        // Mostrar información del concierto
        System.out.println("Concierto:");
        System.out.println("Nombre: " + concierto1.getNombre());
        System.out.println("Hora: " + concierto1.getHora());
        System.out.println("Lugar: " + concierto1.getLugar().getNombre());
        System.out.println("Artistas:");
        
        for(Artista artista : concierto1.getArtista()) {
            System.out.println("- " + artista.getNombre());
        }   
    }
}
