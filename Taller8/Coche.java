package Taller8;

//Ejercicio #1:

//Clase Coche
public class Coche extends Vehiculo {
    //Atributo adicional exclusivo de Coche
    private int numeroDePuertas;
    
    //Constructor que inicializa los atributos heredados y el propio
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }
    
    //Sobrescritura del metodo para mostrar la informacion del coche
    @Override
    public void mostrarInformacion() {
        System.out.println("Coche:");
        //llama al metodo de la superclase para mostrar marca y velocidad
        super.mostrarInformacion();
        System.out.println("Numero de Puertas: " + numeroDePuertas);
    }
}
