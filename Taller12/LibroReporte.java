package Taller12;

//Ejercicio #1:

//Clase LibroReporte
public class LibroReporte {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte del Libro:");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
    }
}