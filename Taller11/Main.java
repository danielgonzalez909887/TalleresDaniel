package Taller11;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5);
        Figura figura2 = new Rectangulo(4, 6);

        figura1.calcularArea(); //Caculamos el area del circulo
        figura2.calcularArea(); //Caculamos el area del rectangulo
    }
}
