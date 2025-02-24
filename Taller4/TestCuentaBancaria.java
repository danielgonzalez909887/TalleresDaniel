package Taller4;

//Ejercicio #2:

//Clase TestCuentaBancaria
public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000, "Ahorro");

        //Podemos acceder y modificar 'saldo' usando los metodos get y set
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.setSaldo(1500);
        System.out.println("Saldo modificado: " + cuenta.getSaldo());

        //Mostrar los detalles de la cuenta
        cuenta.mostrarDetalles();
    }

}