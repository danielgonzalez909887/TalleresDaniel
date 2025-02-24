package Taller5.vehiculos;

//Ejercicio #2:

//Clase Vehiculo con sus respectivas propiedades
public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca);
    }

}
