package com.mycompany.Boletin3;
import java.util.Scanner;
public class Boletin3_5 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Interacción " + i);
            i++;
        float num1, num2, num3;
        Scanner op;
        op = new Scanner(System.in);
        System.out.println("Dame tres numeroos: ");
        num1 = op.nextFloat();
        num2 = op.nextFloat();
        num3 = op.nextFloat();
        if(num1 > num2 ){
            if(num1 > num3);
            System.out.println("El número mayor es: " + num1);
        }else if(num2 > num1){
            if(num2 > num3);
            System.out.println("El número mayor es: " + num2);
        }else if(num3>num1){
            if(num3>num2);
            System.out.println("El número mayor es: " + num3);
        }else{
            System.out.println("Algún número está igual o to");
        }
        }while( i < 5);
            System.out.println("E N D");

        }

    }

