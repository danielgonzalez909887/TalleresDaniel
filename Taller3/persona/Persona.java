package Taller3.persona;

//Ejercicio #3:

//Clase Persona con sus respectivas propiedades
public class Persona {
    private String nombre;
    int edad;

    //Constructor para inicializar las propiedades
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo get para nombre
    public String getNombre() {
        return nombre;
    }

    //Metodo set para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
