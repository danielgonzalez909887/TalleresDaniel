package Taller10;

//Ejercicio #1:

//Clase Figura
public abstract class Figura {
    //Metodo abstracto para calcular el area
    public abstract double calcularArea();
    
    //Metodo para mostrar el area
    public void mostrarArea() {
        System.out.println("El area es: " + calcularArea());
    }
}