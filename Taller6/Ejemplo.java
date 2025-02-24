package Taller6;

//Ejercicio #3:

//Clase Ejemplo
public class Ejemplo {
    //Atributo no estatico
    private int contador = 0;

    //Metodo incorrecto
    /*public static void incrementar() {
        contador++;
    }*/

    //Metodo correcto
    public void incrementar() {
        contador++;
    }

    //Metodo no static para mostrar el valor del contador
    public void mostrarContador() {
        System.out.println("Contador: " + contador);
    }

}
