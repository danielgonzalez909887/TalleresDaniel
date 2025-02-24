package Taller3;

//Clase de prueba dentro del mismo paquete
public class TestProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Computador", 500.00, 5);
        producto.mostrarInfo();
    }
}