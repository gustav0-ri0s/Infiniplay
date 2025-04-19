package com.infiniplay.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Podcast extends Audio {
    //Añade: presentador, invitados, episodio
    private String presentador;
    private List<String> invitados;
    private int episodio;
    private int temporada;

    public Podcast(String titulo, int duracion, String presentador, List<String>invitados, int temporada,int episodio) {
        super(titulo, duracion);
        this.presentador = presentador;
        this.invitados = new ArrayList<>(invitados);
        this.episodio = episodio;
        this.temporada = temporada;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        if (presentador == null || presentador.trim().isEmpty()) {
            throw new IllegalArgumentException("El presentador no puede estar vacío");
        }
        this.presentador = presentador;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        if (episodio <= 0) {
            throw new IllegalArgumentException("El número de episodio debe ser positivo");
        }
        this.episodio = episodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        if (temporada <= 0) {
            throw new IllegalArgumentException("La temporada debe ser positiva");
        }
        this.temporada = temporada;
    }

    // Métodos para manejar invitados
    public void agregarInvitado(String invitado) {
        if (invitado != null && !invitado.trim().isEmpty()) {
            this.invitados.add(invitado);
        }
    }

    public void eliminarInvitado(String invitado) {
        this.invitados.remove(invitado);
    }

    public List<String> getInvitados() {
        return Collections.unmodifiableList(invitados); // Lista inmutable
    }

    @Override
    public String toString() {
        return String.format("Podcast: %s - Temporada %d, Episodio %d | Presentador: %s | Invitados: %s",
                getTitulo(), temporada, episodio, presentador, String.join(", ", invitados));
    }
}


