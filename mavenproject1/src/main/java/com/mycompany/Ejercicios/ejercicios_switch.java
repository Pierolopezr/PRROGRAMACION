package com.mycompany.Ejercicios;
import java.util.Scanner;
/**
 * Convierte la nota introducida de 0 a 10 en su equivalente en suspenso, bien, notable y sobresaliente
 * @version 1.0
 * @author Piero López Rosas
 */
public class ejercicios_switch {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Interacción " + i);
            i++;
        System.out.println("¿Cuál es tu nota?");
        Scanner op;
        op = new Scanner(System.in);
        int notas = op.nextInt();
            switch (notas) {
                /* otra forma
                case 1,2,3,4 -> System.out.println("Suspenso");

                case 5 -> {
                    System.out.println("Suspenso");
                    System.out.println("Suspensefeo");
                }
                */
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Suspenso");
                    break;
                case 5: case 6:
                    System.out.println("Bien");
                    break;
                case 7:
                case 8:
                    System.out.println("Notable");
                    break;
                case 9:
                case 10:
                    System.out.println("Sobresaliente");
                    break;
                default:
                    System.out.println("Inválido");
            }}while (i < 5) ;
    }
}
