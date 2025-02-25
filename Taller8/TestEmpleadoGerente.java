package Taller8;

//Ejercicio #3:

//Clase TestEmpleadoGerente
public class TestEmpleadoGerente {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 2500.0);
        empleado.mostrarDetalles();

        System.out.println("---------------------------");

        Gerente gerente = new Gerente("Ana", 5000.0, "Recursos Humanos");
        gerente.mostrarDetalles();
    }
}