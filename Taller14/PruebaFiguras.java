package Taller14;

//Ejercicio #1:
public class PruebaFiguras {
    public static void main(String[] args) {
        //Se crean instancias de Circulo y Rectangulo, pero se usan referencias de tipo Figura para cumplir con el LSP
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);

        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
    }
}