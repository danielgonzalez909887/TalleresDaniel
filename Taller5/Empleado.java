package Taller5;

//Ejercicio #1:

//Clase Empleado con sus respectivas propiedades
public class Empleado {
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    //Metodo para mostrar informacion del empleado
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " - Salario: " + salario);
    }

}
