package Taller11;

//Ejercicio #2:

//Clase Profesor
public class Profesor extends Persona {
    private String materia;

    public Profesor(String materia) {
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy profesor de " + materia + ".");
    }
}