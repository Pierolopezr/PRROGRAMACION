package com.mycompany.Ejercicios;
/**
 * funcion que reciba dos paramteros y que sea tipo tabla y otro un valor, que busque dentro de esa tabla que busque ese valor. si existe que de vuelta el indice, y si no existe que de vuelta -1
 * @version 1.0
 * @author Piero López Rosas
 */
public class Ejercicio_Matrices {
    public static void main(String[] args) {
        int[] tabla;
        tabla = new int[30];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) Math.floor(Math.random() * 101); //Mathfloor :   Mathrandom: general numeros aleatorios entre el 0 y el 10. notas[] indica el valor de las notas de 0 a 10
        }
        int numero = 30;
        tabla[3] = 30;
        funcion(tabla, numero);
    }
    static void funcion(int[] tabla, int numero){
        for (int i = 0; i < tabla.length; i++){
            if(numero == tabla[i]){
                System.out.println(i);
            }else{
                System.out.println("-1");
            }
        }
    }
}
//MAL PLANTEADO