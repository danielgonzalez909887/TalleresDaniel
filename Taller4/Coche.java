package Taller4;

//Ejercicio #2:

//Clase Coche con sus respectivas propiedades
public class Coche {
    // Propiedades privadas
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    //Constructor
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodo acelerar que incrementa velocidadMaxima solo si el incremento es positivo
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        } else {
            System.out.println("El incremento es positivo.");
        }
    }

    //Metodo para mostrar la información del coche
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidad Máxima: " + velocidadMaxima);
    }
}