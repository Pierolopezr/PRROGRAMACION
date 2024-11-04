package com.mycompany.Ejercicios;
/**
 * funciones recursivas
 * @version 1.0
 * @author Piero López Rosas
 */
public class FuncionesRecursivas {
    public static void main (String[] args){
        System.out.println("El factoral de 5 es: " + factorialRecursivas(5));
        System.out.println("La potencia de  es: " + potenciaRecursivas(2, 5));
    }

    static long factorialRecursivas(int n){

        long res;
        if (n==0){
            res =  1;
        }else {
            res = n * factorialRecursivas (n - 1);}

        return res;
    }

    static long potenciaRecursivas(int m, int n){
        // m elevado a la n
        long res;

        if (n==0){
            res = 1;
        }else {
            res =  m * potenciaRecursivas( m, n-1);
        }
        return res;
    }
}
/*
        static long funcionRecursiva(){
        long res;
        if (caso base){
        res = valorBase
        }else

        res = funcion recursiva (nuevo dato);
        return res;
        }
 */
/*

    ejemplo con factorial de 5
    5! = 5 x 4 x 3 x 2 x 1
             --------------
                 4!
                -----------
                    3!
                    -------
                       2!
                       ----
                         1!
                        1=0!
*/
