package Taller2;

//Ejercicio #1:

//Clase Producto con sus respectivas propiedades
public class Producto {
    String nombre;
    double precio;

    //Constructor con 2 parametros
    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodo statico para mostrar los productos
    public static void mostrarProducto(Producto p) {
        System.out.println("El nombre del producto es: : " + p.nombre);
        System.out.println("El precio del producto es: " + p.precio);
    }
        
    // Método main para probar la clase
    public static void main(String[] args) {
        Producto producto1 = new Producto("Chocolate", 25.00);
        
        mostrarProducto(producto1);
    }
    
}