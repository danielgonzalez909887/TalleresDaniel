package Taller14;

//Ejercicio #3:
public class PruebaTransporte {
    public static void main(String[] args) {
        //Se usan referencias de tipo Transporte para instanciar Bicicleta y Coche
        Transporte transporte1 = new Bicicleta();
        Transporte transporte2 = new Coche();

        transporte1.mover();
        transporte2.mover();
    }
}