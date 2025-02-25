//Ejercicio #1:

//Clase Rectangulo
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    //Constructor que inicializa la base y la altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Implementacion del metodo calcularArea para un rectangulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
}