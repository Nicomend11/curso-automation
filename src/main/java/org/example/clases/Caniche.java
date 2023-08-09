package org.example.clases;

import org.example.clases.Perro;

public class Caniche extends Perro {

    private int edad;

    public Caniche(String nombre, String tipo, int edad) {
        super(nombre, tipo);

        this.edad = edad;
    }
}
