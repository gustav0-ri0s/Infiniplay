import com.infiniplay.modelos.Cancion;
import com.infiniplay.modelos.Podcast;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cancion cancion = new Cancion("Bohemian Rhapsody", 355, "Queen", "A Night at the Opera", "Rock", 1975);
        Cancion cancion1 = new Cancion("Flowers",200,"Miley Cyrus","Endless Summer Vacation","Pop",2023);
        Cancion cancion2 = new Cancion("Titi Me Preguntó", 242, "Bad Bunny", "Un Verano Sin Ti", "Reggaetón", 2022);
        Cancion cancion3 = new Cancion("Ojos Color Sol", 190, "Calle 13 ft. Silvio Rodríguez", "Entren los que quieran", "Alternativo", 2010);

        System.out.println(cancion);
        cancion.reproducir();
        cancion.reproducir();
        cancion1.reproducir();
        cancion2.reproducir();
        cancion3.reproducir();

        System.out.println(cancion.getTotalDeReproducciones());
        //PODCAST
        // 1. Crear una lista inicial de invitados
        List<String> invitadosIniciales = new ArrayList<>();
        invitadosIniciales.add("Gustavo Rios");
        invitadosIniciales.add("Thalia Tello");

        //2. Crear Podcast
        Podcast miPodcast = new Podcast(
                "Tecnología y Futuro",
                1800,"Ana López",invitadosIniciales,
                3, 12
        );

        miPodcast.agregarInvitado("Luis Martinez");
        miPodcast.reproducir();
        miPodcast.reproducir();

        System.out.println(miPodcast);

        // 5. Mostrar información del podcast
        System.out.println("\n==== Información del Podcast ===");
        System.out.println(miPodcast);
        System.out.println("Presentador: " + miPodcast.getPresentador());
        System.out.println("Invitados: " + miPodcast.getInvitados());
        System.out.println("Temporada: " + miPodcast.getTemporada());
        System.out.println("Episodio: " + miPodcast.getEpisodio());
        System.out.println("Reproducciones: " + miPodcast.getTotalDeReproducciones());








    }


}
