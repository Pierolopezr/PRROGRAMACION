package com.mycompany.Ejercicios;
/**
 * Hacer una cuenta atrás desde el 10 al 0.
 * @version 1.0
 * @author Piero López Rosas
 */
public class ContaAtras {
    public static void main (String[] args){

        // CONTA ATRAS
        //System.out.println (i);
        for (int m = 10; m >= 0; m--){
            System.out.println("Conta atrás con For: " + m);
        }

        System.out.println("\n");

        int z = 10;
        while ( z>= 0){
            System.out.println("Conta atrás con while: " + z);
            z--;
        }
    }
}
