package Taller5;

//Ejercicio #1:

//Clase TestEmpleadoGerente
public class TestEmpleadoGerente {
    public static void main(String[] args) {
        //Creacion de un objeto Empleado
        Empleado empleado = new Empleado("Juan", 3800);
        empleado.mostrarInformacion();
        
        //Creacion de un objeto Gerente
        Gerente gerente = new Gerente("Daniel", 5000, "Programacion");
        gerente.mostrarInformacion();
    }

}
