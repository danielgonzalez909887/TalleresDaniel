package Taller4;

//Ejercicio #3:

//Clase TestClaseSinGetSet
public class TestClaseSinGetSet {
    public static void main(String[] args) {
        ClaseSinGetSet obj = new ClaseSinGetSet();
        
        //Al intentar acceder a 'mensaje' desde aqui genera error, ya que es private y no hay un getter:
        //System.out.println(obj.mensaje);
        
        //No existe forma de leer o modificar 'mensaje' desde fuera de la misma clase.
    }

}
