package Taller4;

//Ejercicio #1:

//Clase Empleado con sus respectivas propiedades
public class Empleado {
    public String nombre;
    private double salario;

    //Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    //Metodo get para el salario
    public double getSalario() {
        return salario;
    }

    //Metodo para validar que el salario no sea negativo
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

}
