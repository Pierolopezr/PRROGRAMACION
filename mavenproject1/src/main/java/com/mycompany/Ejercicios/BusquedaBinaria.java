package com.mycompany.Ejercicios;

import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
    // Crear una tabla ordenada (arreglo) de ejemplo
    int[] tabla = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

    // Mostrar la tabla con un método personalizado
    System.out.print("Tabla ordenada: ");
    imprimirArreglo(tabla);

    // Pedir al usuario un número para buscar
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número para buscar: ");
    int objetivo = scanner.nextInt();

    // Llamar al método de búsqueda binaria
    int resultado = busquedaBinaria(tabla, objetivo);

    // Mostrar el resultado
    if (resultado != -1) {
        System.out.println("El número " + objetivo + " se encuentra en el índice: " + resultado);
    } else {
        System.out.println("El número " + objetivo + " no está en la tabla.");
    }

    scanner.close();
}

    /**
     * Método para realizar la búsqueda binaria
     *
     * @param tabla    Arreglo ordenado donde buscar
     * @param objetivo Número a buscar
     * @return Índice del objetivo si se encuentra, -1 si no se encuentra
     */
    public static int busquedaBinaria(int[] tabla, int objetivo) {
        int inicio = 0;
        int fin = tabla.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2; // Evitar desbordamiento

            // Verificar si el elemento está en el medio
            if (tabla[medio] == objetivo) {
                return medio;
            }

            // Si el objetivo es mayor, ignorar la mitad izquierda
            if (tabla[medio] < objetivo) {
                inicio = medio + 1;
            } else { // Si el objetivo es menor, ignorar la mitad derecha
                fin = medio - 1;
            }
        }

        // Si llegamos aquí, el elemento no está presente
        return -1;
    }

    /**
     * Método personalizado para imprimir un arreglo en formato legible
     *
     * @param arreglo Arreglo a imprimir
     */
    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

