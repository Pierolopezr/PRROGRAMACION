package com.mycompany.Ejercicios;
/**
 *  inserta n notas, y cuado escribas -1, el programa te da la media.
 * @version 1.0
 * @author Piero López Rosas
 */
import java.util.Scanner;
public class NotasWhile {
    public static void main (String[] args){
        Scanner op;
        op = new Scanner(System.in);
        System.out.println("Inserta la nota (-1 to quit)");
        double n = op.nextDouble();
        double sum = 0.0;
        double num = 0.0;
        double media;
        while(n != -1){
            sum = sum + n;
            System.out.println("Inserta -1 to quit");
            n = op.nextDouble();
            num++;
        }
        media = sum / num;
        System.out.println("La media es: " + media );
    }
}
