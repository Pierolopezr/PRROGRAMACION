package ClaseAbril;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderRapido {
    public BufferedReaderRapido(String rutaFichero) {
        String texto="";
        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader(rutaFichero));
            String linha = entrada.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = entrada.readLine();
            }
        }catch (IOException e){
                System.out.println("Error de entrada de fichero: " + e.getMessage());
            } finally {
                if (entrada != null){
                    try{
                        entrada.close();
                    }catch (IOException e){
                        System.out.println(e.getMessage());
                    }
                }
            }
    }
}

