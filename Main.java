import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro3 = new Libro();
        //Ingresar datos por consola para inicializar objetos
        Libro libro4 = Libro.crear_libro_desde_consola(scanner);
        //CuentaBancaria
        CuentaBancaria cuenta_bancaria1 = new CuentaBancaria();
        CuentaBancaria cuenta_bancaria2 = CuentaBancaria.crear_cuenta_bancaria_desde_consola(scanner);
        //Estudiante
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = Estudiante.crear_estuduante_desde_consola(scanner);

        System.out.println("\n\n\n\n--------------");
        libro3.detalleLibro();
        System.out.println("--------------");
        libro4.detalleLibro();
        System.out.println("--------------");
        //CuentaBancaria
        cuenta_bancaria1.detalleCuentaBancaria();
        System.out.println("--------------");
        cuenta_bancaria2.detalleCuentaBancaria();
        System.out.println("--------------");
        //Estudiante
        estudiante2.MostrarEstudiante();
        System.out.println("--------------");
        estudiante3.MostrarEstudiante();
        System.out.println("--------------");

        // Mostrar libros utilizando el metodo toString()
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println("--------------");
        //CuentaBancaria
        System.out.println(cuenta_bancaria1);
        System.out.println(cuenta_bancaria2);
        System.out.println("--------------");
        //Estudiante
        System.out.println(estudiante2);
        System.out.println(estudiante3);
        System.out.println("--------------");

        scanner.close();
    }
}
