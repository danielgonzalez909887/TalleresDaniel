package Taller11;

//Ejercicio #1:

//Clase Rectangulo
class Rectangulo extends Figura {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }
}