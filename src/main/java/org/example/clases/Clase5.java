package org.example.clases;

import java.util.Scanner;

public class Clase5 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar Nombre y Apellido: ");
        String nombreYApellido = scanner.nextLine();
        System.out.println("Nombre y Apellido ingresdo es: " + nombreYApellido);

        System.out.println("Ingresar Nombre: ");
        String nombre = scanner.next();
        System.out.println("Nombre ingresdo es: " + nombre);

        System.out.println("Ingresar Edad: ");
        int edad = scanner.nextInt();
        System.out.println("La Edad ingresada es: " + edad);

        System.out.println("Ingresar Precio: ");
        float precio = scanner.nextFloat();
        System.out.println("El Precio ingresado es: " + precio);
    }
}
