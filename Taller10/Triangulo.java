package Taller10;

//Ejercicio #1:

//Clase Triangulo
public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    //Constructor que inicializa la base y la altura
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Implementacion del metodo calcularArea para un triangulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}