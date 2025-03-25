package Taller14;

//Ejercicio #2:
public class PruebaCuentas {
    public static void main(String[] args) {
        //Se utiliza una referencia de la clase base para instanciar una CuentaAhorros
        CuentaBancaria cuenta = new CuentaAhorros("12345", 1000.0, 0.05);
        
        //Operaciones
        cuenta.depositar(500.0);
        System.out.println("Saldo despues del deposito: " + cuenta.getSaldo());
        
        cuenta.retirar(200.0);
        System.out.println("Saldo despues del retiro: " + cuenta.getSaldo());

        CuentaAhorros cuentaAhorros = (CuentaAhorros) cuenta;
        System.out.println("Interes calculado: " + cuentaAhorros.calcularInteres());
    }
}