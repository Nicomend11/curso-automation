package org.example.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Herencia {

    public static void main(String[] args) {

        Gato colo = new Gato();
        Perro toby = new Perro("Toby", "callejero");

        colo.hacerRuido(); //llamamos al metodo
        toby.hacerRuido();

        colo.caminar();
        toby.caminar();

        List<Animal> animales = new ArrayList<>();
        animales.add(colo);
        animales.add(toby);

        // Animal un Animal = new Animal();  no se puede instanciar una clase abstracta

        System.out.println("Holaaaaa");

        String var1 = "Chauuuu";
        System.out.println(var1);

        System.out.println(toby);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar nombre de Perro");
        String nombrePerro = scanner.next();

        System.out.println("Ingresar tipo de Perro");
        String tipoPerro = scanner.next();

        Perro firulais = new Perro(nombrePerro, tipoPerro);

        System.out.println(firulais);


    }
}
