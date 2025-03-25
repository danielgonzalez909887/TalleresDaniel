package Taller12;

//Ejercicio #2:

//Clase ProductoEtiqueta
public class ProductoEtiqueta {
    private CalcularPrecioProducto precioProducto;

    public ProductoEtiqueta() {
        this.precioProducto = new CalcularPrecioProducto();
    }

    //Se genera una etiqueta para el producto usando el precio calculado
    public String generarEtiqueta(Producto producto) {
        double precioFinal = precioProducto.calcularPrecioFinal(producto);
        return "Producto: " + producto.getNombre() + " - Precio Final: " + precioFinal;
    }
}