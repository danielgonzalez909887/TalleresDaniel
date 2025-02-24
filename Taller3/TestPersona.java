package Taller3;

//Ejercicio #1:

//Clase TestPersona
public class TestPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }

}