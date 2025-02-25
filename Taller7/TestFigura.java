//Ejercicio #1:

//Clase TestFigura
public class TestFigura {
    public static void main(String[] args) {
        //Instanciamos un circulo y un rectangulo
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        
        System.out.println("Area del Circulo:");
        circulo.mostrarArea();
        
        System.out.println("Area del Rectangulo:");
        rectangulo.mostrarArea();
    }
}