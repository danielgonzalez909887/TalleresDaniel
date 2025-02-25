//Ejercicio #2:

//Clase Empleado
public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    //Metodo abstracto que debe ser implementado por las subclases
    public abstract double calcularSalario();
    
    //Metodo para mostrar los detalles del empleado usando calcularSalario()
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Salario: " + calcularSalario());
    }
}