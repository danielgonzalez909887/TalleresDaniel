package Taller14;

//Ejercicio #2:

//Clase CuentaBancaria
public class CuentaBancaria {
    protected double saldo;
    protected String numeroCuenta;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    //Metodo para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    //Metodo para depositar una cantidad en la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor a 0");
        }
    }

    //Metodo para retirar una cantidad de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("Cantidad invalida para retirar");
        }
    }

    //Metodo para obtener el numero de cuenta
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}