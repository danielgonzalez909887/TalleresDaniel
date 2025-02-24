package Taller4;

//Ejercicio #1:

//Clase TestEmpleado
public class TestEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", 1500.0);
        System.out.println("Empleado: " + empleado1.nombre);
        System.out.println("Salario: " + empleado1.getSalario());

        empleado1.setSalario(2000.0);
        System.out.println("Nuevo salario: " + empleado1.getSalario());

        //Ejemplo de asignar un salario negativo:
        empleado1.setSalario(-500.0);
    }
}
