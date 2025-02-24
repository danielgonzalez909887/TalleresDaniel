package Taller6;

//Ejercicio #1:

//Clase Coche con sus respectivas propiedades
public class Coche {
    private String marca;
    private String modelo;
    
    //Atributo static para contar las instancias de Coche
    private static int contadorCoches = 0;
    
    //Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }
    
    //Metodo static para mostrar cuantos coches se han creado
    public static void mostrarContadorCoches() {
        System.out.println("Se han creado " + contadorCoches + " coches.");
    }

}
