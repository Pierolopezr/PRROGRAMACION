package com.mycompany.Boletin6;
/**
 * funcion 2 numeros enteros, y saque por pantalla los numeros comprendidos entre ellos
 * @version 1.0
 * @author Piero López Rosas
 */
import java.util.Scanner;
public class Boletin6_1 {
    public static void main(String[] args){
        Scanner op; // inicializo el scanner
        op = new Scanner(System.in);
        System.out.println("Dame dos números enteros y te diré los que están compredidos entre ellos: ");
        int a = op.nextInt();
        int b = op.nextInt();
        double c = 35.27;
        double d = 29.56;
        numerosComprendidos(a, b);
        numerosComprendidos(c, d);
        numerosComprendidos(b);
    }
    static void numerosComprendidos(int num1, int num2){
       if( num1>num2){  // poner cual es mayor y cual es menor
           int aux = num1;
           num1 = num2;
           num2 = aux; // aux : variable auxiliar que se necesita para cambiar el orden, num1 por num2 o viceversa
       }
        for (int i= num1 + 1; i < num2 ; i++){ // +1 para que empience en el siguiente
            System.out.println(i);
        }
    }

    static void numerosComprendidos(double num1, double num2){
        int num1Int = (int) Math.round(num1);
        int num2Int = (int) Math.round(num2);       // redondea los numeros
        numerosComprendidos(num1Int, num2Int);
    }

    static void numerosComprendidos(int num1){
        numerosComprendidos(0, num1);
    }
}
