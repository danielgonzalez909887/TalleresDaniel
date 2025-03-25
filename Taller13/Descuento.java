package Taller13;

//Ejercicio #1:

//Clase Descuento
public class Descuento {
    //Representa el porcentaje de descuento
    protected double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    //Aplicamos el descuento
    public double aplicarDescuento(double precio) {
        return precio - (precio * (porcentaje / 100));
    }
}