package org.example.Ejercicios;

import org.example.Ejercicios.Vehiculo;

public class Coche extends Vehiculo {

    private int cilindrada;
        public Coche(String marca, String modelo, int año, int cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void acelerar() {
        System.out.println("Acelerando");;

    }
}
