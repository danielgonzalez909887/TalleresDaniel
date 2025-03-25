package Taller15;

//Ejercicio #2:
public class PruebaOperacionesBancarias {
    public static void main(String[] args) {
        //Utilizamos la clase que implementa todas las interfaces
        TransferenciaBancaria transferencia = new OperacionesBancarias();
        RetiroBancario retiro = new OperacionesBancarias();
        PagoFactura pagoFactura = new OperacionesBancarias();

        transferencia.transferir(500.0, "123456789");
        retiro.retirar(200.0);
        pagoFactura.pagarFactura(150.0, "Factura100");
    }
}
