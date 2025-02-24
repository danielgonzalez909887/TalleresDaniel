package Taller5;

//Ejercicio #3:

//Clase Banco
public class Banco {
    //La propiedad saldo es protected, lo que permite que cualquier clase en el mismo paquete
    //o cualquier subclase pueda acceder y modificar el saldo directamente.
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }
}
