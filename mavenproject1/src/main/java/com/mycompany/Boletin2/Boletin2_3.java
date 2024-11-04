/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Boletin2;

/**
 *
 * @author dam
 */
import java.util.Scanner;
public class Boletin2_3 {
    public static void main (String [] args){
      Float cambio, euro,  dolares; 
      Scanner ob;
      ob = new Scanner(System.in);
      System.out.println("¿Cual es el valor de cambioo de euro a dolar?");
      cambio = ob.nextFloat();
      System.out.println("¿Cúantos euro quieres cambiar?");
      euro = ob.nextFloat();
      dolares = euro * cambio;
      System.out.println("La cantidad de dolares es: " + dolares+"$");
      dolares = ob.nextFloat();
      ob.close();
      
    }  
}
