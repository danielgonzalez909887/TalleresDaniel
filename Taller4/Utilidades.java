package Taller4;

//Ejercicio #3:

//Clase Utilidades con sus respectivas propiedades
public class Utilidades {
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

    //Metodo para dividir
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return a / b;
    }
}
