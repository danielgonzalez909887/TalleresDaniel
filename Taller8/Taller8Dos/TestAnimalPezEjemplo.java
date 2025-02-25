package Taller8.Taller8Dos;

//Ejercicio #2:

//Clase TestAnimalPez
public class TestAnimalPezEjemplo {
    public static void main(String[] args) {
        Pez pez1 = new Pez("Tiburon", "Salada");
        pez1.mostrarDetalles();
        
        System.out.println("----------------------");
        Pez pez2 = new Pez("Carpa", "Dulce");
        pez2.mostrarDetalles();
    }
}
