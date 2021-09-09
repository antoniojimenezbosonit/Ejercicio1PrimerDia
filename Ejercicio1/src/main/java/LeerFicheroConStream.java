import java.io.FileNotFoundException;
import java.util.List;

public interface LeerFicheroConStream {
     List<String> leerFicheroConStream() throws FileNotFoundException;
     void listarFicheroConStream(List<String> People);
}
