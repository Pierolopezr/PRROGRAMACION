package ClaseAbril;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraTablaNumerosBinaria {
    EscrituraTablaNumerosBinaria(int[] taboa){
        ObjectOutputStream fluxoSalida = null;
        try{
            fluxoSalida = new ObjectOutputStream(new FileOutputStream("numeros.dat"));
            if (taboa != null){
                for (int num : taboa){
                    fluxoSalida.writeInt(num);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("Erro: Ficheiro non encontrado. " + e.getMessage());
        }catch(IOException e){
            System.out.println("Erro: Entrada/saida. " + e.getMessage());
        }finally {
            if(fluxoSalida != null) {
                try{
                    fluxoSalida.close();
                }catch (IOException e){
                    System.out.println("Erro: Pechando o ficheiro. " + e.getMessage());
                }
            }
        }
    }
}
