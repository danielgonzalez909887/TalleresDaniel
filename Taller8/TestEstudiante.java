package Taller8;

//Ejercicio #2:

//Clase TestEstudiante
public class TestEstudiante {
    public static void main(String[] args) {
        //Creacion de instancias de Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", 20, "ABC123");
        Estudiante estudiante2 = new Estudiante("Pedro", 22, "ZXA321");
        
        //Uso de los metodos para mostrar informacion
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
    }
}
