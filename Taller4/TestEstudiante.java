package Taller4;

public class TestEstudiante {
    public static void main(String[] args) {
        //Creación de una instancia valida de Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", 20, 8.5);
        estudiante1.mostrarInfo();

        //Modificando propiedades mediante setters
        try {
            estudiante1.setNombre("Pedro");
            estudiante1.setEdad(25);
            estudiante1.setNotaPromedio(9.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        estudiante1.mostrarInfo();

        //Intento de crear un estudiante con datos inválidos
        try {
            Estudiante estudiante2 = new Estudiante("", -5, 11);
            estudiante2.mostrarInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear estudiante: " + e.getMessage());
        }
    }

}