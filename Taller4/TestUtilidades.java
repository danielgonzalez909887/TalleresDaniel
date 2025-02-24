package Taller4;

//Ejercicio #3:

//Clase TestUtilidades
public class TestUtilidades {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;

        //Suma
        double resultadoSuma = Utilidades.sumar(a, b);
        System.out.println(a + " + " + b + " = " + resultadoSuma);

        //Resta
        double resultadoResta = Utilidades.restar(a, b);
        System.out.println(a + " - " + b + " = " + resultadoResta);

        //Multiplicacion
        double resultadoMultiplicacion = Utilidades.multiplicar(a, b);
        System.out.println(a + " * " + b + " = " + resultadoMultiplicacion);

        //Division
        try {
            double resultadoDivision = Utilidades.dividir(a, b);
            System.out.println(a + " / " + b + " = " + resultadoDivision);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en la division: " + e.getMessage());
        }

        //Ejemplo de division por cero
        try {
            double resultadoDivisionCero = Utilidades.dividir(a, 0);
            System.out.println(a + " / 0 = " + resultadoDivisionCero);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en la division: " + e.getMessage());
        }
    }

}
