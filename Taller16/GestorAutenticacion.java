package Taller16;

//Ejercicio #1:

//Clase GestorAutenticacion
public class GestorAutenticacion {
    private ServicioAutenticacion servicio;

    //Inyeccion de dependencia mediante el constructor
    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public boolean iniciarSesion(String username, String password) {
        return servicio.autenticar(username, password);
    }

    //Metodo para cambiar la estrategia de autenticacion en tiempo de ejecucion
    public void setServicioAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }
}