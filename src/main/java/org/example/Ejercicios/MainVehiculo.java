package org.example.Ejercicios;

public class MainVehiculo {

    public static void main(String[] args) {

        // Crear instancia de la clase Vehiculo
        Vehiculo Toyota = new Vehiculo("Toyota", "Corolla", 2020);

        // Crear instancia de la clase Coche
        Coche Ford = new Coche("Ford", "Mustang", 2021, 5000);

        // Imprimir información de los objetos creados
        System.out.println("Vehiculo: " + Toyota.getMarca() + " " + Toyota.getModelo() + " " + Toyota.getAño());
        System.out.println("Coche: " + Ford.getMarca() + " " + Ford.getModelo() + " " + Ford.getAño() + " cilindrada: " + Ford.getCilindrada());
    }
}
