package Taller3;

//Ejercicio #2:

//Clase TestVehiculo
public class TestVehiculo {
    public static void main(String[] args) {
        // Instanciación de objetos
        Vehiculo vehiculo = new Vehiculo();
        Bicicleta bicicleta = new Bicicleta();
        
        vehiculo.moverse();
        bicicleta.moverse();
        
        Vehiculo vehiculoPolimorfico = new Bicicleta();
        vehiculoPolimorfico.moverse();
    }

}
