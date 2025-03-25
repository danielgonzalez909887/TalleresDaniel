package Taller15;

//Ejercicio #2:

//Clase OperacionesBancarias
public class OperacionesBancarias implements TransferenciaBancaria, RetiroBancario, PagoFactura {
    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transfiriendo " + monto + " a la cuenta " + cuentaDestino);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retirando " + monto + " de la cuenta");
    }

    @Override
    public void pagarFactura(double monto, String numeroFactura) {
        System.out.println("Pagando factura " + numeroFactura + " con monto " + monto);
    }
}