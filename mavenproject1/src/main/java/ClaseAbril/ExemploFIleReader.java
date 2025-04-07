package ClaseAbril;
import java.io.FileReader;
import java.io.IOException;

public class ExemploFIleReader {
    public static void main(String[] args) {
        String texto = "";
        FileReader entrada = null;
        try {
            entrada = new FileReader("/home/dam/PROGRAMACION/mavenproject1/src/main/java/ClaseAbril/FicheiroTextoDeProba");
            int caracter;
            caracter = entrada.read();

            while (caracter!=-1){
                texto = texto + (char) caracter;
                caracter = entrada.read();
            }
        }catch (IOException e){
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }finally {
            if (entrada != null){
                try{
                entrada.close();
            }catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("O texto del fichero es: \n" + texto);
    }
}
