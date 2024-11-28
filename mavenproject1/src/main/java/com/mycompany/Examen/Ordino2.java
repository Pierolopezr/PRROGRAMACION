
package com.mycompany.Examen;
import java.util.Scanner;
public class Ordino2 {
    public static void main(String[] args){
     // do while
     int resto, i= 0;
     Scanner op = new Scanner(System.in);
     System.out.println("Qué número natural quieres saber su raíz cuadrada¿?");
     int num = op.nextInt();
     op.close();
     do{
         i++;
     }while(i*i<=num);
     resto=num-((i-1)*(i-1));
     System.out.println("La raíz cuadrada de " + num + " es " + (i-1) + " con resto " + resto);
     examenFor();
    }
    //for
    static void examenFor(){
        int n= 101;
        int b=0;
        int aprox= 0;
        for(; aprox < n; b++){
            aprox = b * b;
        }
        if (aprox == n){
            System.out.println("La raíz es " + (b-1) + " y el resto es 0");
        }else{
            System.out.println("La raíz es " + (b-2) + " y el resto es " + (n-(b-2)*(b-2)));
        }
    }
}
