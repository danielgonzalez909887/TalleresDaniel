package Taller13;

//Ejercicio #3:
public class PruebaMensajero {
    public static void main(String[] args) {
        //Envio de correo electronico
        Mensajero mensajeroEmail = new MensajeroEmail();
        mensajeroEmail.enviarMensaje("daniel@gmail.com", "Hola por Email");

        //Envio de SMS
        Mensajero mensajeroSMS = new MensajeroSMS();
        mensajeroSMS.enviarMensaje("304304", "Hola por SMS");

        //Envio de Notificacion Push
        Mensajero mensajeroPush = new MensajeroPush();
        mensajeroPush.enviarMensaje("DanielPush1", "Hola por Push");
    }
}