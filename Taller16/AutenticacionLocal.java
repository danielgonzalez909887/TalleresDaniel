package Taller16;

//Ejercicio #1:

//Clase AutenticacionLocal
public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String username, String password) {
        if(username.equals("usuarioLocal") && password.equals("claveLocal")) {
            System.out.println("Autenticacion local exitosa para " + username);
            return true;
        } else {
            System.out.println("Autenticacion local fallida para " + username);
            return false;
        }
    }
}