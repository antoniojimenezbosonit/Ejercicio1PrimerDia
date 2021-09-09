import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args) throws IOException {
        System.out.println("Vamos a leer el fichero");
        Reader.imprimirArchivo("src/main/java/Ficheroejercicio1.txt");

        System.out.println("Salida ejercicio 2");

        List<String> people = new ArrayList<>();
        ReaderEjercicio2 r2 = new ReaderEjercicio2();
        people = r2.leerFicheroConStream();
        r2.listarFicheroConStream(people);
    }

}