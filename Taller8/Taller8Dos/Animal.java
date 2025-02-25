package Taller8.Taller8Dos;

//Ejercicio #2:

//Clase Animal
public class Animal {
    protected String especie;
    
    public Animal(String especie) {
        this.especie = especie;
    }
    
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}
