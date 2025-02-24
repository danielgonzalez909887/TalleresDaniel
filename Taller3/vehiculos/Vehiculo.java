package Taller3.vehiculos;

//Ejercicio #2:

//Clase Vehiculo con sus respectivas propiedades
public class Vehiculo {
    String tipo;

    //Constructor
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarInfo() {
        System.out.println("Tipo vehiculo: " + tipo);
    }
}
