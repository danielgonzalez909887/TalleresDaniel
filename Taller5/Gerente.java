package Taller5;

//Ejercicio #1:

//Clase Gerente
public class Gerente extends Empleado {
    private String departamento;
    
    //Constructor que inicializa los atributos heredados y la propiedad adicional
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    
    //Sobrescritura del metodo mostrarInformacion para incluir el departamento
    @Override
    public void mostrarInformacion() {
        System.out.println("Gerente: " + nombre + " - Salario: " + salario + " - Departamento: " + departamento);
    }

}
