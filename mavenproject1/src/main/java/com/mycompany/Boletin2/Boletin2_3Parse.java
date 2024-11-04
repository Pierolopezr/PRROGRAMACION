package com.mycompany.Boletin2;

import java.util.Scanner;
public class Boletin2_3Parse {
    public static void main(String[] args) {
        String cambio, euro;
        double dolares;
        Scanner ob;
        ob = new Scanner(System.in);
        System.out.println("¿Cual es el valor de cambio de euro a dolar?");
        cambio = ob.next();
        System.out.println("¿Cúantos euro quieres cambiar?");
        euro = ob.next();
        dolares = Double.parseDouble(euro) * Double.parseDouble(cambio);
        System.out.println("La cantidad de dolares es: " + dolares + "$");

        ob.close();

    }
}
