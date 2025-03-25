package Taller11;

//Ejercicio #3:

//Ejemplo 2 del uso incorrecto del polimorfismo

//Clase Base
class Base {
    public void mostrarMensaje() {
        System.out.println("Mensaje clase base.");
    }
}

//Clase derivada que sobrescribe el metodo sin modificar su comportamiento
class Derivada extends Base {
    @Override
    public void mostrarMensaje() {
        //Simplemente se llama al metodo de la clase base sin realizar ningun cambio.
        super.mostrarMensaje();
    }
}

public class EjemploSobrescribirMetodo {
    public static void main(String[] args) {
        Base objeto = new Derivada();
        objeto.mostrarMensaje();
    }
}

/*
    Hacer esto es una mala practica, ya que Sobrescribir el
    metodo mostrarMensaje() sin modificar su comportamiento
    resulta redundante y puede generar confusiones.
*/