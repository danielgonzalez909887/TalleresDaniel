package Taller15;

//Ejercicio #3:
public class PruebaVehiculos {
    public static void main(String[] args) {
        //Vehiculo que solo se conduce (Coche)
        Conduccion coche = new Coche();
        coche.conducir();

        //Vehiculo que se conduce y transporta mercancia (Camion)
        Camion camion = new Camion();
        camion.conducir();
        camion.cargarMercancias();
        
        Conduccion vehiculoConducible = new Camion();
        TransporteMercancia vehiculoTransporte = new Camion();
        
        vehiculoConducible.conducir();
        vehiculoTransporte.cargarMercancias();
    }
}