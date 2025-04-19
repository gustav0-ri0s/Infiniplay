package com.infiniplay.modelos;

public class Cancion extends Audio{
    private String artista;
    private String album;
    private String genero;
    private int anioLanzamiento;

    @Override
    public int getClasificacion() {
        if (getMeGusta()>5000){
           return 8;
        } else {
            return 4;
        }
    }

    public Cancion (String titulo, int duracion, String artista, String album, String genero, int anioLanzamiento){
        super(titulo,duracion);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        setAnioLanzamiento(anioLanzamiento);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        if (anioLanzamiento < 1900 || anioLanzamiento > java.time.Year.now().getValue()){
            throw new IllegalArgumentException("Año inválido: " + anioLanzamiento);
        }else {
            this.anioLanzamiento = anioLanzamiento;
        }

    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString(){
        return String.format("%s - %s (%d) | Álbum: %s", artista, getTitulo(), anioLanzamiento, album);
    }
}
