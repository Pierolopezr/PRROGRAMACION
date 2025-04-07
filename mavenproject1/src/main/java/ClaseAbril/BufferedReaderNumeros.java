package ClaseAbril;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class BufferedReaderNumeros {
    public BufferedReaderNumeros(String rutaFicheroNumeros) {
        String texto="";
        int suma = 0;
        int contador = 0;
        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader(rutaFicheroNumeros));
            String linha = entrada.readLine();
            while (linha != null) {

                System.out.println("Linha leida: " + linha);
                texto += linha + "\n";

                String [] numeros = linha.split(" ");

                for (String num : numeros) {
                    suma += Integer.parseInt(num);
                    contador++;
                }

                linha = entrada.readLine();
            }
            // Mostrar la suma total
            System.out.println("Suma total: " + suma);

            // Mostrar la media

            if (contador > 0){
                double media = (double)suma / contador;
                System.out.println("La media es: " + media);
            }else{
                System.out.println("No se han encontrado números para calcular la media");
            }

        }catch (IOException e){
            System.out.println("Error de entrada de fichero: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir un valor a número: " + e.getMessage());
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
