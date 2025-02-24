package Taller2;

//Ejercicio #2:

//Clase Estudiante con sus respectivas propiedades
public class Estudiante {
    String nombre;
    int edad;

    //Constructor por defecto
    public Estudiante() {
        this("Daniel", 20);
    }

    //Constructor con 2 parametros
    public Estudiante (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo statico para mostrar los estudiantes
    public static void mostrarEstudiante(Estudiante e) {
        System.out.println("El nombre del estudiante es: : " + e.nombre);
        System.out.println("La edad del estudiante es: " + e.edad);
    }
        
    // Método main para probar la clase
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Esteban", 25);
        
        mostrarEstudiante(estudiante1);
    }
    
}