package com.mycompany.Ejercicios;
/*
 *  Lee 10 numeros, leer la suma de los numeros que introduzca el usuario, y 999 para exit
 * @version 1.0
 * @author Piero López Rosas
 */
import java.util.Scanner;
public class BreakFor {
    public static void main(String[] args){
        Scanner op;
        op = new Scanner(System.in);
        int  num, cant, sum = 0;
        System.out.println("Dame 10 números (999 para salir): ");
        for(num= 1; num<11; num++){ // ajusto los parámetros para que solo me lea los 10 primeros numeros que inserte
            cant= op.nextInt();
            if (cant == 999) {  // Condición
                break;
            }
            sum = sum + cant;
        }

        System.out.println("La suma es: " + sum);


        int suma, numeroSum;     // Do WHILE
        suma= 0;
        int i=0;
        do{
            System.out.println("Introduce el numero (999 para salir 2): ");
            numeroSum = op.nextInt();
            if (numeroSum==999) break;
            suma = suma + numeroSum;
            i++;
        }while (i<=10);
        System.out.println("La suma es: " + suma);

        // el while tiene error, parece que sí, pero no.


    }

}
