package Taller5;

//Ejercicio #3:

//Clase BancoEncasulado
public class BancoEncasulado {
    private double saldo;

    //Constructor que inicializa el saldo, con validacion
    public void Banco(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    //Metodo getter para consultar el saldo
    public double getSaldo() {
        return saldo;
    }

    //Metodo para depositar dinero, con validacion
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        saldo += monto;
    }

    //Metodo para retirar dinero, con validacion para no dejar saldo negativo
    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser positivo.");
        }
        if (monto > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes.");
        }
        saldo -= monto;
    }

    //Metodo para mostrar los detalles del saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

}
