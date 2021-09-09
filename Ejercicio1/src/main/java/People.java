public class People {
    private String Nombre;
    private String Poblacion;
    private Integer Edad;

    public People() {
    }

    public People(String nombre, String poblacion, Integer edad) {
        Nombre = nombre;
        Poblacion = poblacion;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String poblacion) {
        Poblacion = poblacion;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
