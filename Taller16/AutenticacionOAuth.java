package Taller16;

//Ejercicio #1:

//Clase AutenticacionOAuth
public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String username, String password) {
        if(username.equals("usuarioOAuth") && password.equals("claveOAuth")) {
            System.out.println("Autenticacion OAuth exitosa para " + username);
            return true;
        } else {
            System.out.println("Autenticacion OAuth fallida para " + username);
            return false;
        }
    }
}