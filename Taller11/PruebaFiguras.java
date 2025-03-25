package Taller11;

//Ejercicio #1:

//Clase PruebaFiguras
public class PruebaFiguras {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5);
        Figura figura2 = new Rectangulo(4, 6);

        figura1.calcularArea(); // Llamada polimórfica
        figura2.calcularArea(); // Llamada polimórfica
    }
}