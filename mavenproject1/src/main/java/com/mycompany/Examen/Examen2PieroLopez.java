package com.mycompany.Examen;
import java.util.Scanner;
/**
 * Tabla de tamaño 20m para almacenar los titulos de los libros(inicialmente vacio apuntando a null)
 * @version 1.0
 * @author Piero López Rosas
 */
public class Examen2PieroLopez {
    public static void main(String[] args){
        int [] libro;
        libro = new int[20];
        visualizarLibros(libro);
    }
    static void visualizarLibros(int[] libro){
        for (int i=0; i<libro.length; i++){
            if(libro[i] == 0){

                System.out.println("Baleiro");

            }
        }

    }
    public static boolean engadirLibro(String[] biblioteca, String titulo){
        boolean chea = true;
        for(int i=0; i< biblioteca.length; i++){
            if(biblioteca[i] == null){
                biblioteca[i] = titulo;
                chea = false;
                break;
            }
        }
        return chea;
    }
    public static boolean eliminarLibro(String[] biblioteca, int indice){
        if(indice>=0 && indice<biblioteca.length && biblioteca[indice] != null){
            biblioteca[indice] = null;
            return true;

        }else return false;

    }
}
