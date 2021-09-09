import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader implements LeerFichero{
    public static void imprimirArchivo(String archivo) throws IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        var contador = 1;
        while((cadena = b.readLine())!=null) {
            String[] cadenaSeparada = cadena.split(":");
            var nombre = "";
            var poblacion = "";
            var edad = "";
            if(cadenaSeparada.length == 3){
                nombre = cadenaSeparada[0];
            }else{
                nombre = "";
            }
            if(cadenaSeparada.length == 3) {
                poblacion = cadenaSeparada[1];
            }else{
                poblacion = "";
            }
            if(cadenaSeparada.length == 3){
                edad = cadenaSeparada[2];
            }else {
                edad = "";
            }
            System.out.println("Linea"+ contador + ". " + "Nombre: " + nombre + ". Problacion: " + poblacion + ". Edad: " + edad);
            contador++;
        }
        b.close();
    }
}
