package Taller13;

//Ejercicio #3:

//Interfaz MensajeroEmail
public class MensajeroEmail implements Mensajero {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando correo electronico a: " + destinatario + " con el mensaje: " + mensaje);
    }
}