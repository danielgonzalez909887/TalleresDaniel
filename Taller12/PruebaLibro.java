package Taller12;

//Ejercicio #1:
public class PruebaLibro {
    public static void main(String[] args) {
        //Creamos la entidad Libro
        Libro libro = new Libro("Java Avanzado", "Juan Perez");

        //Usamos la clase LibroReporte para generar el reporte del libro
        LibroReporte reporte = new LibroReporte();
        reporte.generarReporte(libro);

        //Usamos la clase LibroPersistencia para guardar el libro
        LibroPersistencia libroPersistencia = new LibroPersistencia();
        libroPersistencia.guardarLibro(libro);
    }
}