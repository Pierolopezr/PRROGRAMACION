package com.mycompany.Ejercicios;
/**
 * Explicación con funciones parte II, con un código más simple
 * @version 1.0
 * @author Piero López Rosas
 */
import java.util.Scanner;
public class EjeFuncionesII {
    public static void main(String []args) {
        String nomeEstudante = obterNome();  // devuele al string de abajo pq da una funcion "obternome"
        saudos(3, "en");
        System.out.println("Welcome Mr, Mss: " + nomeEstudante);
        saudos(5, "gl");
        System.out.println("Otras tareas en medio");
        saudos(2, "es");
    }
    static void saudos(int veces, String idioma){               // tiene que estar fuera de la funcion main
                                                                // () puedo meter un parametro
                                                                // void :  una funcion puede no devolver nada o algo de lo anterior
                                                                // El nada no se refiere al for, if de a continuaion, pq en este caso no mdevuelve nada el void, el
                                                                //  nada se refiere a otra cosa
        String nome = obterNome();
        for (int i= 0; i<veces; i++){
            if(idioma.equals("gl")) System.out.println("Hola" + nome );
            else if (idioma.equals("es")) System.out.println("Hola " + nome);
            else if (idioma.equals("en")) System.out.println("Hello " + nome);
        }
    }
    static String obterNome(){       // llega del string de arriba y ejecuta el contenido
        Scanner op = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nome = op.next();
        //op.close();
        return nome; //el nome pasa al programa de la variable princial, que puede ser distinta,en este caso nomeEstudante
                     // el return  devuele al programa principal el op.close()
    }
}
