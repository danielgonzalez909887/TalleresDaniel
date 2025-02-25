package Taller10;

//Ejercicio #1:

//Clase Rectangulo
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Implementacion del metodo calcularArea
    @Override
    public double calcularArea() {
        return base * altura;
    }
}