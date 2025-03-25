package Taller15;

//Ejercicio #3:

//Clase Camion
public class Camion implements Conduccion, TransporteMercancia {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camion.");
    }

    @Override
    public void cargarMercancias() {
        System.out.println("Cargando mercancias en el camion.");
    }
}