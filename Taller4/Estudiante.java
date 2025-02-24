package Taller4;

//Ejercicio #1:

//Clase Estudiante con sus respectivas propiedades
public class Estudiante {
    //Propiedades privadas
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    //Metodos get y set para 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        //Validacion: el nombre no puede ser nulo o vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser vacio.");
        }
        this.nombre = nombre;
    }

    //Metodos get y set para 'edad'
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        //Validacion: la edad debe ser mayor a 0 y razonable (por ejemplo, menor o igual a 150)
        if (edad <= 0 || edad > 150) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0 y menor o igual a 150.");
        }
        this.edad = edad;
    }

    //Metodos get y set para 'notaPromedio'
    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        //Validacion: la nota promedio debe estar entre 0 y 10 (suponiendo esta escala)
        if (notaPromedio < 0 || notaPromedio > 10) {
            throw new IllegalArgumentException("La nota promedio debe estar entre 0 y 10.");
        }
        this.notaPromedio = notaPromedio;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Nota Promedio: " + notaPromedio);
    }

}