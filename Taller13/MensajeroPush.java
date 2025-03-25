package Taller13;

//Ejercicio #3:

//Interfaz MensajeroPush
public class MensajeroPush implements Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando notificacion push a: " + destinatario + " con el mensaje: " + mensaje);
    }
}