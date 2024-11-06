package com.mycompany.Ejercicios;

/**
 * Explicación con ejemplo de cada uno: FOR, WHILE, DO-WHILE
 * @version 1.0
 * @author Piero López Rosas
 */
public class For_Do_DoWhile {
    public static void main (String[] args){
        /*
        for: Se utiliza cuando se conoce el número de iteraciones.
        while: Se utiliza cuando no se sabe el número exacto de iteraciones, pero se evalúa la condición antes de cada iteración.
        do-while: Similar a while, pero siempre ejecuta el bloque de código al menos una vez, ya que la condición se evalúa al final.
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hola mundoo" + i );
        }

        System.out.println("\n");

        int j = 1;
        while (j <= 5) {  // Condición
            System.out.println("Hola mundo" + j );
            j++;  // Incremento
        }

        System.out.println("\n");

        int k = 6;  // Inicialización
        do {
            System.out.println("Hola mundo" + k + "\n");
            k++;  // Incremento
        } while (k <= 5);  // Condición
        //En este caso, el bloque de código dentro del do se ejecuta primero, y luego se evalúa la condición i <= 5. Si la condición es verdadera, el bucle se repite.
        //Si la condición es falsa desde el principio, el código dentro del bloque se ejecuta al menos una vez.



    }
}
