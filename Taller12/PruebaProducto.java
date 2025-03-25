package Taller12;

//Ejercicio #2:
public class PruebaProducto {
    public static void main(String[] args) {
        //Creamos un producto
        Producto producto = new Producto("Portatil", 1200.0, 0.15);

        //Utilizamos la clase CalcularPrecioProducto para calcular el precio final
        CalcularPrecioProducto calculator = new CalcularPrecioProducto();
        double precioFinal = calculator.calcularPrecioFinal(producto);
        System.out.println("Precio Final Calculado: " + precioFinal);

        //Utilizamos la clase ProductoEtiqueta para generar una etiqueta del producto
        ProductoEtiqueta etiqueta = new ProductoEtiqueta();
        System.out.println(etiqueta.generarEtiqueta(producto));
    }
}