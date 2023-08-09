package org.example.clases;

import java.util.ArrayList;
import java.util.List;

public class Clase4 {

    public static void main(String[] args) {

        Estudiante pepe = new Estudiante();
        pepe.rendirExamen("Programacion Java");
        pepe.setNombre("PEPE");
        System.out.println("El nombre del Estudiante es: " + pepe.getNombre());

        pepe.setApellido("pepepepepe");

        Estudiante cesar = new Estudiante("Cesar", "Mejia", 1122);
        System.out.println("El nombre del Estudiante es: " + cesar.getNombre());
        System.out.println("El apellido del Estudiante es: " + pepe.getApellido());

        Estudiante miVariable = new Estudiante();
        System.out.println("El nombre del estudiante es: " + miVariable.getNombre());

        List<String> listaDeString = new ArrayList<>();

        listaDeString.add("hola"); //0
        listaDeString.add("chau"); //1
        listaDeString.add(1, "pepe"); // este va a pisar la posición 1 -> va a tener pepe y no chau


    }
}
