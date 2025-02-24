package Taller3;

//Ejercicio #3:

//Clase VehiculoSinOverride
public class VehiculoSinOverride extends Vehiculo {
    //Sobrescritura correcta sin @Override
    public void moverse() {
        System.out.println("El vehiculo se dirige hacia el Centro.");
    }
}