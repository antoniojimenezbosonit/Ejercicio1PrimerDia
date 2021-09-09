import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


public class ReaderEjercicio2 implements LeerFicheroConStream{
    List<People> peopleList = new ArrayList<>();
    @Override
    public List<String> leerFicheroConStream() throws FileNotFoundException {

        List<String> people = new ArrayList<>();

        File f = new File("src/main/java/Ficheroejercicio1.txt");
        Scanner sc = new Scanner(f);

        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String[] person = s.split(":");
            People p = new People();
            p.setNombre(person[0]);
            p.setPoblacion(person[1]);
            p.setEdad(person.length > 2? Integer.parseInt(person[2]):0);
            peopleList.add(p);

        }


        return people;
    }

    @Override
    public void listarFicheroConStream(List<String> People) {

        peopleList.stream()
                .filter(p -> p.getEdad()<15)
                .collect(toList()).forEach( p -> System.out.println("Nombre: " + p.getNombre() + "Poblacion: " + p.getPoblacion() + "Edad: " + p.getEdad()));

    }
}
