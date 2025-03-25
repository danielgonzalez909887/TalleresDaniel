package Taller11;

//Ejercicio #1:

//Clase Circulo
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }
}