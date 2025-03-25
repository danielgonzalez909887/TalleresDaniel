package Taller14;

//Ejercicio #2:

//Clase CuentaAhorros
public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(String numeroCuenta, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    //Metodo especifico para calcular el interes sobre el saldo actual
    public double calcularInteres() {
        return saldo * tasaInteres;
    }
}