//Ejercicio #2:

//Clase CuentaBancaria con sus respectivas propiedades

import java.util.Scanner;

public class CuentaBancaria {
    int numero_cuenta;
    double saldo;
    String tipo_cuenta;

    //Constructor por defecto
    public CuentaBancaria (){
        this.numero_cuenta = 100100;
        this.saldo = 25.00;
        this.tipo_cuenta = "Ahorro";
    }

    //Constructor con 2 parametros
    public CuentaBancaria (int numero_cuenta, String tipo_cuenta){
        this.numero_cuenta = numero_cuenta;
        this.tipo_cuenta = tipo_cuenta;
    }

    //Constructor con 3 parametros
    public CuentaBancaria (int numero_cuenta, double saldo, String tipo_cuenta){
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.tipo_cuenta = tipo_cuenta;
    }

    //Metodos para mostrar los detalles del libro
    public void detalleCuentaBancaria() {
        System.out.println("El numero de cuenta es: " + numero_cuenta);
        System.out.println("El saldo es: " + saldo);
        System.out.println("El tipo de cuenta es: " + tipo_cuenta);
    }

    @Override
    public String toString() {
        return "Cuenta Bancaria: {\n" +
               "Numero cuenta: " + numero_cuenta +
               ",\nSaldo: " + saldo +
               ",\nTipo de cuenta: " + tipo_cuenta +
               "\n}";
    }

    // Metodo para ingresar datos desde consola
    public static CuentaBancaria crear_cuenta_bancaria_desde_consola(Scanner scanner) {
        System.out.print("Digite el numero de cuenta: ");
        int numero_cuenta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite el saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite el tipo de cuenta: ");
        String tipo_cuenta = scanner.nextLine();
        System.out.println("--------------");
        return new CuentaBancaria(numero_cuenta, saldo, tipo_cuenta);
    }
    

}