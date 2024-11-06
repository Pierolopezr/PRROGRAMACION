package com.mycompany.Boletin6;
/**
 *  Deseñar a función eco() a que se lle pasa como parámetro un número n e mostra por pantalla n veces a mensaxe “Ecoo…”
 * @version 1.0
 * @author Piero López Rosas
 */
import java.util.Scanner;
public class Boletin6_2 {
 public static void main(String[] args){
     Scanner op;
     op = new Scanner(System.in);
     int parametro;
     System.out.println("Dime n veces para darte el mesaxe Ecoo...");
     parametro = op.nextInt();
     nparametros(parametro);
 }

 static void nparametros(int n){

     for (int i = 0; i < n; i++) {
         System.out.println("Ecoo..."  );
     }
 }

}
