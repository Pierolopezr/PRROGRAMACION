package com.mycompany.Ejercicios;
/**
 * Dame los múltiplos de 7 menores que 100
 * @version 1.0
 * @author Piero López Rosas
 */
public class Multiplos {
    public static void main(String[] args){

        for (int i = 0; i < 92;) {
            i+=7;
            System.out.println( i );
        }

        System.out.println("\n");

        for (int n=1; 7*n<100; n++){
            System.out.println(7*n);
        }

        System.out.println("\n");

        for (int n=0; n<100; n++){
            if (n%7==0) System.out.println(n); // solo se puede hacer una linea, no es necesario poner llaves o punto y coma,
                                               // inclusive con el else pero con un codigo de qué hacer, y al ; al final.
        }
    }
}
