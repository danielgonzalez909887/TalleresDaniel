package Taller3;

//Ejercicio #1:

//Clase Producto con sus respectivas propiedades
public class Producto {
    String nombre;
    double precio;
    int stock;

    //Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Metodo con acceso de paquete
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

}
