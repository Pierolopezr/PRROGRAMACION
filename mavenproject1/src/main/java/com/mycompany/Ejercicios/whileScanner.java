package com.mycompany.Ejercicios;
import java.util.Scanner;
public class whileScanner {
    public static void main (String[] args) {
        Scanner op;
        op = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter a number (-1 to quit): ");
        int num = op.nextInt();
        while (num != -1) {
            sum = sum + num; // si no meto -1 el numero puesto se convertirá en sum y se irá sumando sucesivamente hasta que pongamos -1.
            System.out.println("Enter a number (-1 to quit): ");
            num = op.nextInt();
        }//end while
        System.out.println("The sum is " + sum);
        //end method main
    }
}
