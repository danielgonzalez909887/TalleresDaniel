package Taller12;

//Ejercicio #2:

//Clase CalcularPrecioProducto
public class CalcularPrecioProducto {
    //Calcula el precio final del producto sumando el impuesto
    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto());
    }
}
