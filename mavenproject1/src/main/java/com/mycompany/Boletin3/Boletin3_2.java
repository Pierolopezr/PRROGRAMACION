package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Boletin3_2 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Interacción " + i);
            i++;

        short a, b,suma,resta;
        Scanner op;
        op = new Scanner(System.in);
        System.out.println("Dime un numero a: ");
        a = op.nextShort();
        System.out.println("Dime un numero b: ");
        b = op.nextShort();

        if(a>=b){

            System.out.println("Resta= " + ( a - b)); // una forma de hacerlo

            System.out.println("Suma= " + ( a + b)); // una forma de hacerlo

        }else{
            suma= (short) (a + b);
            System.out.println("Suma= " + suma);  // otra forma de hacerlo
        }
        } while (i < 5);
    }
}
