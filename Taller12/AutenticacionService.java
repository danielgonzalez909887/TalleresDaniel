package Taller12;

//Ejercicio #3:

//Clase AutenticacionService
public class AutenticacionService {
    //Metodo que verifica al usuario comparando sus credenciales
    public boolean autenticar(Usuario usuario, String username, String password) {
        return usuario.getUsername().equals(username) && usuario.getPassword().equals(password);
    }
}