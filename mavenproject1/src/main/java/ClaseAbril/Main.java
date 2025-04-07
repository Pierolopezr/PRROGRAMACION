package ClaseAbril;

public class Main {
    public static void main(String[] args) {
        new BufferedReaderRapido("src/main/java/ClaseAbril/FicheiroTextoDeProba"); //este  me deja a partir del src
        System.out.println("------------------------------------------");
        new BufferedReaderNumeros("src/main/java/ClaseAbril/FicheiroNumeros");
        MediaSumaFicheiroNumScanner.sumaMedia("src/main/java/ClaseAbril/FicheiroNumeros");
        //IntroducirNumeros.escribir("src/main/java/ClaseAbril/Numeros");
        int [] taboa = { 4, 5, 2, 5, 6, 4, 7, 9, 10, 12, 34, 50, 80};
        new EscrituraTablaNumerosBinaria(taboa);
        new LecturaTablaNumerosBinario("numeros.dat");
    }
}
