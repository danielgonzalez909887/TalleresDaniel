package Taller10;

//Ejercicio #1:

//Clase TestFigura
public class TestFigura {
    public static void main(String[] args) {
        //Crear un objeto Rectangulo
        Figura rectangulo = new Rectangulo(5, 3);
        System.out.print("Rectangulo - ");
        rectangulo.mostrarArea();
        
        //Crear un objeto Triangulo
        Figura triangulo = new Triangulo(6, 4);
        System.out.print("Triangulo - ");
        triangulo.mostrarArea();
    }
}
