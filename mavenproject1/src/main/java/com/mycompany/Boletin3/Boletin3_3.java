package com.mycompany.Boletin3;
import java.util.Scanner;
public class Boletin3_3 {
    public static void main(String[] args) {
                    int i = 0;
                    do {
                    System.out.println("Interacción " + i);
                    i++;
                    float numero;
                    Scanner op;
                    op = new Scanner(System.in);
                    System.out.println("Inserta numero");
                    numero = op.nextFloat();
                    if (numero > 0) {
                        System.out.println("+");
                    } else if (numero < 0) {
                        System.out.println("-");
                    } else {
                        System.out.println("cero");
                    }
                    }while( i < 5);

    }
}
