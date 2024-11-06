package com.mycompany.Ejercicios;
/**
 * Empleo el uso de tablas int y string
 * @version 1.0
 * @author Piero López Rosas
 */
public class tablas {
    public static void main(String [] args){
        int [] edades; // si son varios la variable debe ser en plural
        edades = new int [5];
        edades[0] = 31;
        edades[1] = 23;
        edades[2] = 56;
        edades[3] = 12;
        edades[4] = 32;
        System.out.println(edades[2]); // si sobrepaso con 5 me da error, pq no está dentro de los parámetros, en cambio si pongo 3 y no lo tengo especificado su valor
                                       //   me da 0
        String [] nomes = {"Manuel", "Jose", "Rosa", "Ana"};
        System.out.println(nomes[3]);
    }
}
