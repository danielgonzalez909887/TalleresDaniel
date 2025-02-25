package Taller9;

//Ejercicio #1.1:

//Clase Persona
public class Persona implements Hablador, Trabajador {
    private String nombre;
    
    //Constructor para inicializar el nombre de la persona
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //Implementacion del metodo hablar de la interfaz Hablador
    @Override
    public void hablar() {
        System.out.println(nombre + " esta hablando.");
    }
    
    //Implementacion del metodo trabajar de la interfaz Trabajador
    @Override
    public void trabajar() {
        System.out.println(nombre + " esta trabajando.");
    }
}