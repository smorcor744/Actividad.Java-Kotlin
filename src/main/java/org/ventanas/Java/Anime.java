package org.ventanas.Java;

import java.util.Scanner;

public class Anime {
    private String nombre;
    private int episodios;
    private String genero;

    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }


}
