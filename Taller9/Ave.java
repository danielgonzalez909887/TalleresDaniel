package Taller9;

//Ejercicio #1:

//Clase Ave
public class Ave implements Volador, Cantante {
    //Implementacion del metodo volar de la interfaz Volador
    @Override
    public void volar() {
        System.out.println("El ave esta volando.");
    }
    
    //Implementacion del metodo cantar de la interfaz Cantante
    @Override
    public void cantar() {
        System.out.println("El ave esta cantando.");
    }
}