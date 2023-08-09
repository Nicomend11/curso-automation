package org.example.ExamenIntegrador;

public class Calculadora {

    public int sumar(int valor1, int valor2) {
        return valor1 + valor2;
    }
    public int restar(int valor1, int valor2) {
        return valor1 - valor2;
    }
    public int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }
    public int dividir(int valor1, int valor2) {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            throw new IllegalArgumentException("No es divisible por cero (0)");
        }
    }
}
