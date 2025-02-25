//Ejercicio #2:

//Clase Vendedor
public class Vendedor extends Empleado {
    private int cantidadVentas;
    private double comisionPorVenta;
    
    public Vendedor(String nombre, double salarioBase, int cantidadVentas, double comisionPorVenta) {
        super(nombre, salarioBase);
        this.cantidadVentas = cantidadVentas;
        this.comisionPorVenta = comisionPorVenta;
    }
    
    //Implementacion de calcularSalario para Vendedor (salario base + comisiones)
    @Override
    public double calcularSalario() {
        return salarioBase + (cantidadVentas * comisionPorVenta);
    }
}