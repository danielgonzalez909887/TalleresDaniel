package Taller8;

//Ejercicio #1:

//Clase TestVehiculoCoche
public class TestVehiculoCoche {
    public static void main(String[] args) {
        //Instanciamos un objeto Vehiculo
        Vehiculo vehiculo = new Vehiculo("Toyota", 180);
        vehiculo.mostrarInformacion();
        
        System.out.println("----------------------");
        
        // Instanciamos un objeto Coche, que hereda de Vehiculo
        Coche coche = new Coche("Honda", 200, 4);
        coche.mostrarInformacion();
    }
}
