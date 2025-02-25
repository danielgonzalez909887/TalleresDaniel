package Taller8.Taller8Dos;

//Ejercicio #1:

//Clase Empleado
public class Empleado extends Persona {
    private String departamento;
    
    //Constructor
    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }
    
    //Sobrescritura del metodo mostrarDetalles para incluir el departamento
    @Override
    public void mostrarDetalles() {
        //llama al metodo de la superclase para mostrar nombre y edad
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}