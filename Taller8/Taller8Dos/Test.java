package Taller8.Taller8Dos;

//Ejercicio #1:

//Clase Test
public class Test {
    public static void main(String[] args) {
        //Crear instancia de una Persona
        Persona persona = new Persona("Juan", 30);
        persona.mostrarDetalles();
        
        //Crear instancia de un Empleado
        Empleado empleado = new Empleado("Daniel", 28, "Programador");
        empleado.mostrarDetalles();
    }
}
