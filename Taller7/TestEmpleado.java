//Ejercicio #2:

//Clase TestEmpleado
public class TestEmpleado {
    public static void main(String[] args) {
        // Crear un objeto Gerente
        Empleado gerente = new Gerente("Maria", 3000.0, 1500.0);
        gerente.mostrarDetalles();
        
        // Crear un objeto Vendedor
        Empleado vendedor = new Vendedor("Carlos", 2000.0, 30, 50.0);
        vendedor.mostrarDetalles();
    }
}