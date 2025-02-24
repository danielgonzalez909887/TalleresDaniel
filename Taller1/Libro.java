//Ejercicio #1:

//Clase libro con sus respectivas propiedades

import java.util.Scanner;

public class Libro {
    String titulo;
    String autor;
    int numero_paginas;

    //Constructor que asigna valores predeterminados
    public Libro(){
        this.titulo = "Libro 1";
        this.autor = "Daniel Gonzalez";
        this.numero_paginas = 95;
    }

    //Constructor parametrizado
    public Libro (String titulo, String autor, int numero_paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numero_paginas = numero_paginas;
    }

    //Metodos para mostrar los detalles del libro
    public void detalleLibro() {
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El numero de paginas del libro es: " + numero_paginas);
    }

    @Override
    public String toString() {
        return "Libro: {\n" +
               "Titulo: " + titulo +
               ",\nAutor: " + autor +
               ",\nNumero de paginas: " + numero_paginas +
               "\n}";
    }

    // Metodo para ingresar datos desde consola
    public static Libro crearLibroDesdeConsola(Scanner scanner) {
        System.out.print("Digite el titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite el numero de paginas del libro: ");
        int numero_paginas = scanner.nextInt();
        System.out.println("--------------");
        scanner.nextLine();
        return new Libro(titulo, autor, numero_paginas);
    }

    public static void main(String[] args) {
        //Crear el objeto usando el constructor
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Libro 2", "Juan", 54);

        //llamar al metodo
        libro1.detalleLibro();
        System.out.println("--------------");
        libro2.detalleLibro();
    }
}