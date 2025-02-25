package Taller8.Taller8Dos;

//Ejercicio #1:

//Clase Persona
public class Persona {
    protected String nombre;
    protected int edad;
    
    //Constructor para inicializar los atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodo para mostrar los detalles de la persona
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
