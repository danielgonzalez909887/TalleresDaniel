package Taller13;

//Ejercicio #1:
public class PruebaDescuento {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new Descuento(10);
        double precioOriginal = 100.0;
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Precio con descuento porcentual (10%): " + descuentoPorcentaje.aplicarDescuento(precioOriginal));

        Descuento descuentoFijo = new DescuentoFijo(15);
        System.out.println("Precio con descuento fijo (15): " + descuentoFijo.aplicarDescuento(precioOriginal));
    }
}