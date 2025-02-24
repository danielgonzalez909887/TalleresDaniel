package Taller6;

//Ejercicio #2:

//Clase TestMatematicas
public class TestMatematicas {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;

        //llamadas a los metodos static de la clase Matematicas
        System.out.println("Suma: " + Matematicas.sumar(a, b));
        System.out.println("Resta: " + Matematicas.restar(a, b));
        System.out.println("Multiplicacion: " + Matematicas.multiplicar(a, b));

        try {
            System.out.println("Division: " + Matematicas.dividir(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Error en division: " + e.getMessage());
        }
    }

}
