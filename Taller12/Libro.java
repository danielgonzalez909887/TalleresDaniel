package Taller12;

//Ejercicio #1:

//Clase Libro
public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
}