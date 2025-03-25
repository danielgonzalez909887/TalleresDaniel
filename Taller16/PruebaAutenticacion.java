package Taller16;

//Ejercicio #1:
public class PruebaAutenticacion {
    public static void main(String[] args) {
        // Usando autenticación local
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(autenticacionLocal);
        gestor.iniciarSesion("usuarioLocal", "claveLocal");
        gestor.iniciarSesion("usuarioLocal", "claveIncorrecta");

        // Cambiamos a autenticación OAuth
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        gestor.setServicioAutenticacion(autenticacionOAuth);
        gestor.iniciarSesion("usuarioOAuth", "claveOAuth");
        gestor.iniciarSesion("usuarioOAuth", "claveIncorrecta");
    }
}