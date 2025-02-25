package Taller9;

//Ejercicio #2:

//Clase Pez
public class Pez implements Nadador, Respirador {
    
    @Override
    public void nadar() {
        System.out.println("El pez nada en el agua.");
    }
    
    @Override
    public void respirar() {
        System.out.println("El pez respira a traves de sus branquias.");
    }
}