package Taller12;

//Ejercicio #3:

//Clase Usuario
public class ValidacionService {
    //Metodo para validar el formato del email
    public boolean validarEmail(Usuario usuario) {
        String email = usuario.getEmail();
        return email != null && email.contains("@");
    }
}