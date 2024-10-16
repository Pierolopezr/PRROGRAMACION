package com.mycompany.Ejercicios;
import java.util.Scanner;
/* LO siguiente es el java docs
*/

/**
 * Convierte el número introducido de 0 a 99 en su equivalente en letra
 * @version 1.0
 * @author Piero López Rosas
 */
public class ej_switch2 {
    public static void main(String[] args) {
        String numero, uni, dec;
        int decenas, unidades;
        System.out.println("Dame las decenas: ");
        Scanner op;
        op = new Scanner(System.in);
        decenas = op.nextInt() ;
        unidades = op.nextInt();





        switch(decenas) {
            case 0:
                break;
            case 1:
                System.out.print("diez y ");
                break;
            case 2:
                System.out.print("veinti");
                break;
            case 3:
                System.out.print("treinta y ");
                break;
            case 4:
                System.out.print("cuarenta y ");
                break;
            case 5:
                System.out.print("cincuenta y ");
                break;
            case 6:
                System.out.print("sesenta y ");
                break;
            case 7:
                System.out.print("setenta y ");
                break;
            case 8:
                System.out.print("ochenta y ");
                break;
            case 9:
                System.out.print("noventa y ");
                break;
            default:
                break;
        }

        switch(unidades) {

            case 0:
                System.out.println("cero");
                break;
            case 1:
                System.out.print("uno");
                break;
            case 2:
                System.out.print("dos");
                break;
            case 3:
                System.out.print("tres");
                break;
            case 4:
                System.out.print("cuatro");
                break;
            case 5:
                System.out.print("cinco");
                break;
            case 6:
                System.out.print("seis");
                break;
            case 7:
                System.out.print("siete");
                break;
            case 8:
                System.out.print("ocho");
                break;
            case 9:
                System.out.print("nueve");
                break;
            default:
                break;
        }





    }
}
