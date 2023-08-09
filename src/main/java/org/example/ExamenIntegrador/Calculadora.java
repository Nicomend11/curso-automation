package org.example.ExamenIntegrador;

import java.util.Scanner;

public class Calculadora {

    public int sumar() {
        return 0;
    }

    public int sumar(int operando1) {
        return operando1 + 10;
    }

    public int sumar(int operando1, int operando2) {
        return operando1 + operando2;
    }

    Scanner scanner = new Scanner(System.in);

       // System.out.println("Ingresar Primer Valor");
        int valor1 = scanner.nextInt();

      //  System.out.println("Ingresar Segundo Valor");
        int valor2 = scanner.nextInt();

       // System.out.println("Ingresar Operación");
        String operaciónSuma = scanner.next();


}
