package com.mycompany.Boletin7;
/**
 * Realiza un programa que cree un array chamado “numeros” con 6 numeros aleatorios dun rango de 1 a 50 .Seguidamente visualiza o array o revés (0 primeiro elemento visualizaráse o último e asi sucesivamente).
 * @version 1.0
 * @author Piero López Rosas
 */
public class Boletin7_1 {
    public static void main(String[] args) {
        int[] numeros; //declaro el array
        numeros = new int[6]; //declaro el limite del array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int)Math.floor(Math.random()*51); //Mathfloor :   Mathrandom: general numeros aleatorios entre el 0 y el 51
        }
        System.out.println("Array original: ");
        for (int numero: numeros){
            System.out.print(numero + " ");
        }

        System.out.println("\nArray en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) { //  numeros.length - 1 ---> indica que la longitud (6) se le disminuye 1 y quedaría 5, que es la (pocisión) que se le requiere
                                                        // posicion 5 = 21, posteriormente, como es >=0 , se cumple la condicion, sucesivamente hasta llegar a la posición 0 por i--.
            System.out.print(numeros[i] + " ");
        }
    }
}
