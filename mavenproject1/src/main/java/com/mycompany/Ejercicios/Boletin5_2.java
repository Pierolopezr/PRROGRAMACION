package com.mycompany.Ejercicios;
/**
 *  Calcula la suma y producto de los numeros comprendidos entre 10 y 90.
 * @version 1.0
 * @author Piero López Rosas
 */
public class Boletin5_2 {
    public static void main(String[] args){

        double a, sum= 10, producto= 10;  // Usamos double, pq el resultado del producto supera el limite de un long y un int.
        System.out.println("Dame números entre 10 y 90: ");
        for(a=10; (a>=10 && a<=90); a++){  // añadimo un for pq sabemos la cantidad de numeros a desarrollar

           sum= sum + a;  // colocamos las formulas de suma y producto, respectivamente
           producto= producto * a;
        }
        System.out.println("La suma de los numeros es " + sum + " y el producto es " + producto); // finalmente imprimimos el resultado
    }
}
