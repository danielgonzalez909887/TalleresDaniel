package Taller13;

//Ejercicio #3:

//Interfaz MensajeroSMS
public class MensajeroSMS implements Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a: " + destinatario + " con el mensaje: " + mensaje);
    }
}