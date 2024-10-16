package org.example;
import java.util.Scanner;

public class Boletin3_4_Reformado {
    public static void main(String[] args) {
        String nome1, nome2, nomeP;
        int peso1, peso2, pesoP;


        Scanner op;
        op = new Scanner(System.in);
        System.out.println("Dame tu nome: ");
        nome1 = op.next();
        System.out.println("Dame tu peso: ");
        peso1 = op.nextInt();
        System.out.println("Persona 1" + "\n" + "nome: " + nome1 + "\n" + "peso: " + peso1 + " kg" + "\n");
        System.out.println("Dame tu nome: ");
        nome2 = op.next();
        System.out.println("Dame tu peso: ");
        peso2 = op.nextInt();
        System.out.println("Persona 2" + "\n" + "nome: " + nome2 + "\n" + "peso: " + peso2 + " kg" + "\n");
        op.close();

        if (peso1 == peso2) {
            System.out.println("Los pesos son iguales y su diferencia es cero");
        }else {
            pesoP = (peso1 > peso2) ? peso1 : peso2;
            nomeP = (peso1 > peso2) ? nome1 : nome2;

            System.out.println("Datos de la persona que más pesa:" + "\n" + "nome: " + nomeP + "\n" + "peso: " + pesoP + " kg" + "\n");
            System.out.println("La diferencia de sus pesos es: " + (peso2 - peso1) + "kg");
        }
    }
}

