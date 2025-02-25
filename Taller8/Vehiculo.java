package Taller8;

//Ejercicio #1:

//Clase Empleado
public class Vehiculo {
    private String marca;
    private int velocidadMaxima;
    
    //Constructor
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    //Metodo para mostrar la informacion del vehiculo
    public void mostrarInformacion() {
        System.out.println("Vehiculo:");
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Maxima: " + velocidadMaxima + " km/h");
    }
}
