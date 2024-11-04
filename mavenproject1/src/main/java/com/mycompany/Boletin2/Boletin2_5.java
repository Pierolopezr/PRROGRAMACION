package com.mycompany.Boletin2;

import java.util.Scanner;

public class Boletin2_5 {

        public static void main (String [] args){
            Float millas,  metros;
            int cambio;
            cambio = 1852;
            Scanner ob;
            ob = new Scanner(System.in);


            System.out.println("¿Cúantas millas marinaas  quieres convertir?");
            millas = ob.nextFloat();
            metros = millas * cambio;
            System.out.println(millas + " millas marinas a metros es: "+ metros + "m");
            metros = ob.nextFloat();
            ob.close();


    }
}
