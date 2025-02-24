package Taller3.persona;

//Ejercicio #3:

//Clase TestPersona
public class TestPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", 30);

        System.out.println("Edad: " + p.edad);

        //Accedo al atributo 'nombre' mediante los metodos get y set
        System.out.println("Nombre: " + p.getNombre());

        p.edad = 31;
        System.out.println("Nueva edad: " + p.edad);

        //Modifico al atributo 'nombre' mediante e metodo set
        p.setNombre("Pedro");
        System.out.println("Nuevo nombre: " + p.getNombre());
    }

}
