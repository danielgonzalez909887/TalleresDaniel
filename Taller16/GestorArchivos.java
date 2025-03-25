package Taller16;

//Ejercicio #2:

//Clase GestorArchivos
public class GestorArchivos {
    private Almacenamiento almacenamiento;

    //Inyeccion de dependencia mediante el constructor
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }

    public String recuperar(String nombre) {
        return almacenamiento.recuperarArchivo(nombre);
    }

    //Permite cambiar la estrategia de almacenamiento en tiempo de ejecucion
    public void setAlmacenamiento(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}