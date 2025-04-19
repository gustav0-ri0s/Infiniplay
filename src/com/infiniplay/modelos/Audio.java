package com.infiniplay.modelos;
//CLASE BASE
public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int meGusta;
    private int clasificacion;

    // Constructor
    public Audio (String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.totalDeReproducciones = 0;
        this.meGusta = 0;
        this.clasificacion = 0; // O valor por defecto
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }


    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setClasifiacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void meGusta(){
        this.meGusta++;
    }

    public void reproducir(){
        this.totalDeReproducciones++;
    }
}

