package Taller9.Taller9Dos;

//Ejercicio #1.2:

//Clase Animal
public class Animal implements Volador, Nadador {
    
    @Override
    public void volar() {
        System.out.println("El animal esta volando.");
    }
    
    @Override
    public void nadar() {
        System.out.println("El animal esta nadando.");
    }
}