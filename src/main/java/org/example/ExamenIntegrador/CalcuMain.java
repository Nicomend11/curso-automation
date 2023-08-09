package org.example.ExamenIntegrador;

import java.util.Scanner;

public class CalcuMain {

    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    for (int i = 0; i < 5; i++) {

        System.out.println("Ingresar Primer Valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Ingresar Segundo Valor: ");
        int valor2 = scanner.nextInt();

        System.out.println("Ingresar Operación: ");
        char operación = scanner.next().charAt(0);

        int resultado = 0;

        switch (operación) {
            case '+':
                resultado = calculadora.sumar(valor1, valor2);
                break;
            case '-':
                resultado = calculadora.restar(valor1, valor2);
                break;
            case '*':
                resultado = calculadora.multiplicar(valor1, valor2);
            case '/':
                try {
                    resultado = calculadora.dividir(valor1, valor2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                if (resultado > 0) {
                    System.out.println("Resultado: " + resultado);
                }

                if (resultado < 0) {
                    System.out.println("El resultado es negativo, ten Cuidado!");
                }
                if (resultado > 1000) {
                    System.out.println("El resultado es un número grande");
                }
            }
        }
    }
}
