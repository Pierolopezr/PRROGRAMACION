package com.mycompany.Ejercicios;
import java.util.Scanner;
public class dias_meses {
    public static void main(String[] args) {
        Scanner op;
        op = new Scanner(System.in);
        // Inserto número de mes y me dice el número de  mes y número de días de cada mes

        System.out.println("Introduce el mes (1-12)");
        int mes = op.nextInt();
        int dias = switch (mes){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                // el "yield" es como el return
                yield 31; // retrona 31 a días

            }
            case 4, 6, 9, 11 -> {
                yield 30;

            }
            case 2 -> {
                yield 28;

            }
            default ->  {
                System.out.println("Error: VALOR DE MES INCORRECTO");
                yield -1;
            }

        };  // <-- se pone , pq reconoce al int como otra instrucción
        System.out.println("El mes " + mes + " tiene " + dias + " diaas");
        op.close();
    }

}
