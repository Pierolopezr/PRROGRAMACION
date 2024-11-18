package com.mycompany.Ejercicios;
/**
 * Empleo el uso de tablas int y string (matrices)
 * @version 1.0
 * @author Piero López Rosas
 */
public class tablasMATRICES {
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

        //METODO FOR
        int minimo = edades [0];
        for (int i=1; i<edades.length; i++) // el edades.length indica la longitud de edades que en este caso es 5, si fuera nomes sería 4.
            if (minimo > edades[i]) minimo = edades[i];


        System.out.println("El valor minimo de las edades es: " + minimo);

        // METODO FOR-EACH
        minimo = edades [0];
        for(int edad: edades){ // : indica que SSOLO PARA SEPARAR LOS VALORES NADA MÑAS
            if(minimo > edad) minimo = edad;
            System.out.println(edad);
        }
        System.out.println("El valor minimo de las edades es: " + minimo);

    }
}

