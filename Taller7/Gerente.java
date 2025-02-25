//Ejercicio #2:

//Clase Gerente
public class Gerente extends Empleado {
    private double bonus;
    
    public Gerente(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }
    
    //Implementacion de calcularSalario para Gerente (salario base + bonus)
    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}