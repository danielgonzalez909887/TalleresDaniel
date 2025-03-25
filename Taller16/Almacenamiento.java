package Taller16;

//Ejercicio #2:

//Interfaz Almacenamiento
public interface Almacenamiento {
    void guardarArchivo(String nombre, String contenido);

    String recuperarArchivo(String nombre);
}