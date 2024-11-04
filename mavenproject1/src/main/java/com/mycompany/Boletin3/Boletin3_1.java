package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Boletin3_1 {
    public static void main(String[] args) {
        float n;

        Scanner numero;
        numero = new Scanner(System.in);
        System.out.println("Dame un número");
        n = numero.nextFloat();
        if (n>= 0) {
            System.out.println(n + " e positivo");
        }
        numero.close();

    }
}