package ClaseAbril;

import java.io.*;

public class LecturaTablaNumerosBinario {
    public LecturaTablaNumerosBinario(String rutaFicheiro){
        ObjectInputStream fluxoEntrada = null;
        try{
            fluxoEntrada =new ObjectInputStream(new FileInputStream(rutaFicheiro));
            int num;
            while(true){
                num = fluxoEntrada.readInt();
                System.out.println(num);
            }
        }catch (FileNotFoundException e){
            System.out.println("Error: Ficheiro non encontrado. " + e.getMessage());
        }catch (EOFException e){
            System.out.println("Non hay mais números a leer, se llegó al fin del ficheiro.");
        }catch (IOException e){
            System.out.println("Error: Entrada/saida. " + e.getMessage());
        }finally {
            if(fluxoEntrada != null){
                try{
                    fluxoEntrada.close();
                }catch (IOException e){
                    System.out.println("Error cerrando el ficheiro");
                }

            }
        }
    }
}
