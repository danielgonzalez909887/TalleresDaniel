package Taller11;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo vehiculo1 = new Coche();
        Vehiculo vehiculo2 = new Bicicleta();

        vehiculo.mover();
        vehiculo1.mover();
        vehiculo2.mover();
    }
}
