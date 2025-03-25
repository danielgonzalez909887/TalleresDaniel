package Taller11;

//Ejercicio #2:

//Clase Estudiante
public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante de " + carrera + ".");
    }
}