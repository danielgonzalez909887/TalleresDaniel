package Taller15;

//Ejercicio #1:

//Clase Mantenimiento
public class Mantenimiento implements Reparacion, Limpieza {
    @Override
    public void reparar() {
        System.out.println("Realizando reparacion especializada.");
    }

    @Override
    public void limpiar() {
        System.out.println("Realizando limpieza especializada.");
    }
}