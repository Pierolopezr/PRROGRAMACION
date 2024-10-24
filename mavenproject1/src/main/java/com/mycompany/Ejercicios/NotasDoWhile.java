package com.mycompany.Ejercicios;
/**
 *  inserta n notas, y cuado escribas -1, el programa te da la media.
 * @version 1.0
 * @author Piero López Rosas
 */
import java.util.Scanner;
public class NotasDoWhile {
    public static void main (String[] args){
        Scanner op;
        op = new Scanner(System.in);

        double sum = 0.0, nota = 0.0;
        double num = 0;

        do{
            System.out.println("Inserta la nota (-1 to quit)");
            nota = op.nextDouble();
            if( nota != -1) {
                sum = sum + nota;
                num++;
            }
        }while(nota != -1);


        System.out.println("La media es: " + sum / num);



    }
}
