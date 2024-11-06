package com.mycompany.Boletin6;

public class Boletin6_9 {
    // Método recursivo para calcular el n-ésimo número de Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Método iterativo para calcular el n-ésimo número de Fibonacci
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, fibonacci = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        return fibonacci;
    }

    // Método principal para probar las funciones de Fibonacci
    public static void main(String[] args) {
        int n = 10; // Número de Fibonacci que queremos calcular

        // Llamada a la función recursiva
        System.out.println("Fibonacci Recursivo de " + n + ": " + fibonacciRecursive(n));

        // Llamada a la función iterativa
        System.out.println("Fibonacci Iterativo de " + n + ": " + fibonacciIterative(n));
    }

}
