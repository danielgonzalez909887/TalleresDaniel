package Taller3.testVehiculos;

import Taller3.vehiculos.Vehiculo;
import Taller3.vehiculos.Moto;

//Ejercicio #2:

//Clase TestVehiculos
public class TestVehiculos {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Automovil");
        Moto moto = new Moto("Deportiva");

        // Se puede llamar a los métodos públicos de Vehiculo y Moto
        vehiculo.mostrarInfo();
        moto.mostrarInfo();
    }

}
