package Taller8;

//Ejercicio #3:

//Clase Empleado
public class Empleado {
    protected String nombre;
    protected double salario;

    //Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //Metodo para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre + " - Salario: " + salario);
    }
}