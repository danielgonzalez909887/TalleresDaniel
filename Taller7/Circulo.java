//Ejercicio #1:

//Clase Circulo
public class Circulo extends Figura {
    private double radio;
    
    //Constructor que inicializa el radio
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    //Implementacion del metodo calcularArea para un circulo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}