package Taller8;

//Ejercicio #3:

//Clase Gerente
public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    //Sobrescritura del metodo mostrarDetalles para incluir el departamento
    @Override
    public void mostrarDetalles() {
        System.out.println("Gerente: " + nombre + " - Salario: " + salario + " - Departamento: " + departamento);
    }
}