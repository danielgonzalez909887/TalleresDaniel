//Ejercicio #3:

//Clase Estudiante con sus respectivas propiedades

import java.util.Scanner;

public class Estudiante {
    String nombre;
    int edad;
    String curso;

    //Constructor por defecto
    public Estudiante (){
        this.nombre = "Daniel Gonzalez";
        this.edad = 16;
        this.curso = "10-1";
    }

    //Constructor que acepta como parametros el nombre y la edad
    public Estudiante (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Constructor que acepta todos los parametros
    public Estudiante (String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante: {\n" +
               "nombre: " + nombre +
               ",\nedad: " + edad +
               ",\ncurso: " + curso +
               "\n}";
    }

    // Metodo para ingresar datos desde consola
    public static Estudiante crear_estuduante_desde_consola(Scanner scanner) {
        System.out.print("Digite el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Digite la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite el curso del estudiante: ");
        String curso = scanner.nextLine();
        System.out.println("--------------");
        return new Estudiante(nombre, edad, curso);
    }


    public void MostrarEstudiante() {
        System.out.println("El nombre del estudiante es: " + nombre);
        System.out.println("La edad del estudiante es: " + edad);
        System.out.println("El curso del estudiante es: " + curso);
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Daniel Gonzalez", 16, "10-1");

        //llamar al metodo
        estudiante1.MostrarEstudiante();
    }

}