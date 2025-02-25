
//Ejercicio #1:

//Clase Figura
public abstract class Figura {
    //Metodo abstracto que cada subclase debe implementar para calcular el area
    public abstract double calcularArea();
    
    //Metodo para mostrar el area utilizando el metodo calcularArea()
    public void mostrarArea() {
        System.out.println("El area es: " + calcularArea());
    }
}