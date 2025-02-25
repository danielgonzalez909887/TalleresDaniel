package Taller8;

//Ejercicio #2:

//Clase Persona
public class Persona {
    protected String nombre;
    protected int edad;
    
    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodo para mostrar la informacion de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
