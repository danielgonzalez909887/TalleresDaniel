package Taller11;

//Ejercicio #3:

//Ejemplo 1 del uso incorrecto del polimorfismo

//Clase Base
class Base {
    public void metodoBase() {
        System.out.println("Metodo de la clase Base");
    }
}

//Clase Derivada que añade un metodo exclusivo
class Derivada extends Base {
    //Metodo exclusivo de la clase Derivada
    public void metodoDerivado() {
        System.out.println("Metodo exclusivo de la clase Derivada");
    }
}

public class UsoIncorrectoPolimorfismo {
    public static void main(String[] args) {
        //Se crea una instancia de Derivada, pero la referencia es de tipo Base.
        Base objeto = new Derivada();
        objeto.metodoBase(); //Esto funciona, ya que metodoBase() esta en la clase Base.
        
        //La siguiente linea provocaria un error de compilacion:
        //objeto.metodoDerivado();
    }
}