package Taller3;

//Ejercicio #3:

//Clase TestVehiculoSobrescritura
public class TestVehiculoSobrescritura {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.moverse(); // Imprime: El vehiculo se esta moviendo.
        
        Vehiculo vehiculoDerivado = new VehiculoSinOverride();
        vehiculoDerivado.moverse();
    }

}