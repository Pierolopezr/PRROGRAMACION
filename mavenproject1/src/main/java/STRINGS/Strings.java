package STRINGS;

import java.sql.SQLOutput;

/**
 * CARÁCTERES UNICODE
 * @version 1.0
 * @author Piero López Rosas
 */
public class Strings {
    public static void main(String[] args){
        // Caracteres unicode en cistema decimal y hexadecimal, respectivamente

        char caracter;
        /* caracter = 'a';*/
        caracter = 945; // decimal
        /*caracter = '\u03B1'; //se quita el +, y con barra contraria primero , hexadecimal*/
        System.out.println(caracter);

        // ABECEDARIO


        for (int i = 65; i < 91; i++){  //minúsculas
            caracter = (char) i;
            System.out.println(caracter);
        }
        System.out.println("\n");
        for (int i = 97; i < 123; i++){ // mayúsculas
            caracter = (char) i;
            System.out.println(caracter);
        }

        // identificar si el carácter es un dígito o una letra
        // Cabe resaltar que se fija en el último valor que le diste al caracter, en este caso el último for , el sout

        System.out.println(Character.isDigit(caracter)); // digito es número
        System.out.println(Character.isLetter(caracter)); // si es letra
        System.out.println(Character.isSpaceChar(caracter)); // si hay espacio
        System.out.println(Character.isWhitespace(caracter)); // si hay un espacio en blanco
        System.out.println(Character.isLowerCase(caracter));  // si hay minúsculas
        System.out.println(Character.toUpperCase(caracter)); // convierte la última letra a Mayúscula


        //Lo que se puede hacer en un texto de STRING
        char[] nom = {'M', 'a', 'n', 'u', 'e', 'l'};
        String nome = "Manuel";
        nome = "Piero\n \bPicapi\bedra \r\t\u2661"; // t es tabulación.
                                                    // va un espacio a la zquierda, pudiendo quitar un espacio en blanco o borrar una letra o x cosa que esté antes del b
                                                    // r se carga todo lo de atrás, va al inicio
        String apelido = new String ("Lopez");
        boolean opcion = true;
        System.out.println(nome);

        System.out.println( "La longitud del array es " + nom.length);
        System.out.println("La longitud del String es " + nome.length());
        System.out.println("La longitud de \"nome\" es " + nome.length() + " \'" + opcion + "\'"); // Intridocir comillas dobles dentrode la cadena
        System.out.println("Imprimimos \\ texto\\ \ncon \tcontrabarras \f");
        System.out.println("Tres tristes tigres \r comen \b\b\btrigo"); // el r se va al inicio y las 3 b se van hasta m de comen


        // equals

        String cad1 = "ola";
        String cad2 = new String( "ola");
        if (cad1.equals ( cad2)) System.out.println("Son iguales"); // compara el contenido del string
        else System.out.println("Son distintos");

        //---------------------------------------------------------------------------------------------------------------
        int num [] = {1,2,3,4};
        int num2 [] = {1,2,3,4};

        if(num==num2) System.out.println("Son iguales");
        else System.out.println("Son distintos");

        // equalsIgonreCase()  ----> Ignora las mayúsculas
        if(cad1.equalsIgnoreCase(cad2)) System.out.println("son iguales");
        else System.out.println("son diferentes");

        // compareTo () ----> Compara alfabéticamente las letras iniciales [posteriormentes las segundas letras y así en caso haya igualdad]
        // dando como a menor y z mayor.
        // (0 es iguales) ( > 0 mayor) ( < 0 menor)

        String ave = "Blondrina";
        String mamifero = "Aorro";
        if(ave.compareToIgnoreCase(mamifero)>0) System.out.println("Ave mayor " + ave.compareToIgnoreCase(mamifero));
        else System.out.println("Ave menor " + ave.compareToIgnoreCase(mamifero));

        // Se da un valor al comparar con el compareTo, a las letras iniciales según su número de ubicación en el abecedario.
        // En este caso B --> 2 y A --> 1, lo cual lo que hace el compareTo es restar 2-1 = 1 y tomar el valor si es > 0  a "ave mayor"

        
    }
}
