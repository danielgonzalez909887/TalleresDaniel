package Taller12;

//Ejercicio #3:
public class PruebaSistema {
    public static void main(String[] args) {
        //Creamos un usuario
        Usuario usuario = new Usuario("danielg", "12345", "daniel@gmail.com");

        //Usamos el servicio de validacion para verificar el email
        ValidacionService validacion = new ValidacionService();
        if (validacion.validarEmail(usuario)) {
            System.out.println("El email es valido.");
        }
        else {
            System.out.println("El email no es valido.");
        }

        //Usamos el servicio de autenticacion para verificar las credenciales
        AutenticacionService autenticacion = new AutenticacionService();
        boolean autenticado = autenticacion.autenticar(usuario, "danielg", "12345");

        if (autenticado) {
            System.out.println("Usuario autenticado correctamente.");
        } else {
            System.out.println("Error en la autenticacion.");
        }
    }
}