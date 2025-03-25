package Taller15;

//Ejercicio #1:
public class PruebaMantenimiento {
    public static void main(String[] args) {
        //Utilizamos la clase que implementa ambas interfaces
        Reparacion reparador = new Mantenimiento();
        Limpieza limpiador = new Mantenimiento();

        reparador.reparar();
        limpiador.limpiar();
    }
}