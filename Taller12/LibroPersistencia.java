package Taller12;

//Ejercicio #1:

//Clase LibroPersistencia
public class LibroPersistencia {
    //Simulacion de la persistencia de los datos

    public void guardarLibro(Libro libro) {
        System.out.println("Guardando el libro: " + libro.getTitulo());
    }

    public Libro obtenerLibro(String obtLibro) {
        System.out.println("Obteniendo el libro: " + obtLibro);
        return new Libro("Libro de Ejemplo", "Autor Ejemplo");
    }
}