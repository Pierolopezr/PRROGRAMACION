/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Boletin2;

/**
 *
 * @author dam
 */
import java.util.Scanner;
public class Boletin2_4 {
    public static void main (String [] args){
        float numA, numB, suma, resta, producto, cociente;
        Scanner op;
        op = new Scanner (System.in);
        System.out.println("Dime un numeroo numA: ");
        numA= op.nextFloat();
        System.out.println("Dime un numero numB: ");
        numB= op.nextFloat();
        suma= numA + numB;
        resta= numA - numB;
        producto= numA * numB;
        cociente= numA / numB;
        System.out.println("Las respuestas son: \n" + suma + "\n" + resta + "\n"+ producto + "\n"+ cociente + "\n");
        op.close();
    }    
}
