package Taller4;

//Ejercicio #2:

//Clase TestCoche
public class TestCoche {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 250);
        coche.mostrarInfo();

        coche.acelerar(20);
        coche.mostrarInfo();

        coche.acelerar(-10);
        coche.mostrarInfo();
    }

}