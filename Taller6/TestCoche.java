package Taller6;

//Ejercicio #1:

//Clase TestCoche
public class TestCoche {
    public static void main(String[] args) {
        //Crear instancias de Coche
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Mustang");
        
        Coche.mostrarContadorCoches(); //Imprime cuantos coches se han creado
    }

}
