package Taller8;

//Ejercicio #2:

//Clase Estudiante
public class Estudiante extends Persona {
    //Atributo adicional para la matricula
    private String matricula;
    
    //Constructor que inicializa los atributos heredados y matricula
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }
    
    //Sobrescritura del metodo mostrarInformacion para incluir la matricula
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Matricula: " + matricula);
    }
}
