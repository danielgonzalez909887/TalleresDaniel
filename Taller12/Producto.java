package Taller12;

//Ejercicio #2:

//Clase Producto
public class Producto {
    private String nombre;
    private double precioBase;
    private double impuesto;

    public Producto(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    //Getters
    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }
    public double getImpuesto() { return impuesto; }
}