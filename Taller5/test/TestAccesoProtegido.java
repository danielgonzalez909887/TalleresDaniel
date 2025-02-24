package Taller5.test;

import Taller5.vehiculos.Vehiculo;
import Taller5.vehiculos.Moto;

//Ejercicio #2:

//Clase TestAccesoProtegido
public class TestAccesoProtegido {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Automovil", "Mazda");
        Moto moto = new Moto("Deportiva", "Yamaha", 600);

        // Se pueden invocar métodos públicos sin problema.
        vehiculo.mostrarInfo();
        moto.mostrarInfo();

        //Intento de acceder directamente a los miembros protegidos:
        //Las siguientes lineas provocaran errores de compilacion, ya que
        //TestAccesoProtegido no es una subclase ni pertenece al mismo paquete que Vehiculo.
        //System.out.println(vehiculo.tipo);   // ERROR: 'tipo' tiene acceso protegido en Vehiculo
        //System.out.println(vehiculo.marca);  // ERROR: 'marca' tiene acceso protegido en Vehiculo
    }

}
