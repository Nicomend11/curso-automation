package org.example.Ejercicios;

public class Vehiculo {

    private String marca;
    private String modelo;

    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }
    public void acelerar() {
        System.out.println("BRUUUUMM BRUUUUMM");;

    }
    private void frenar() {
        System.out.println("Frenar a cero");
    }
}
