package com.mycompany.Boletin5;
    /*
     *  Calcula la cantidade numeros negativos, positivos, ceros que hay en un grupo de 10 numeros enteros.
     * @version 1.0
     * @author Piero López Rosas
     */
import java.util.Scanner;
    public class Boletin5_1 {
        public static void main(String[] args){
            Scanner op;
            op = new Scanner(System.in);
            int cant, num, neg= 0, posi= 0, ceros= 0; // Inicio con int porque los numemros son enteros
            System.out.println("Dame 10 numeros: ");

            for(num= 1; num<11; num++){ // ajusto los parámetros para que solo me lea los 10 primeros numeros que inserte
                cant= op.nextInt();
                    if (cant < 0) {
                        neg++;
                    }
                    if (cant > 0) { // coloco las condiciones para contabilizar los negativos, positivos y ceros, respectivamente.
                        posi++;
                    }
                    if (cant == 0) {
                        ceros++;
                    }
                }
            System.out.println("Hay " + neg + " nº negativos, " + posi + " nº positivos y " + ceros + " nº ceros"); // finalemente imprimo
        }
    }

