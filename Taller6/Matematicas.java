package Taller6;

//Ejercicio #2:

//Clase Matematicas con sus respectivas propiedades
public class Matematicas {
    //Metodo para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    //Metodo para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    //Metodo para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    //Metodo para dividir dos numeros, con una validacion para evitar la division entre cero
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return a / b;
    }

}
