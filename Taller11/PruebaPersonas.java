package Taller11;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante("Ingenieria de sistemas");
        Persona profesor = new Profesor("Programacion");

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}