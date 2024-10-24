package com.mycompany.Ejercicios;
import java.util.Scanner;
/**
 *  Calcula la cantidade numeros negativos, positivos, ceros que hay en un grupo de 10 numeros enteros.
 * @version 1.0
 * @author Piero López Rosas
 */
public class Boletin5_1 {
    public static void main(String[] args){
        Scanner op;
        op = new Scanner(System.in);
        int cant, num, neg= 0, posi= 0, ceros= 0;
        System.out.println("Dame 10 numeros: ");

        for(num= 1; num<11; num++){
            cant= op.nextInt();
                if (cant < 0) {
                    neg++;
                }
                if (cant > 0) {
                    posi++;
                }
                if (cant == 0) {
                    ceros++;
                }
            }
        System.out.println("Hay " + neg + " nº negativos, " + posi + " nº positivos y " + ceros + " nº ceros");
    }
}




