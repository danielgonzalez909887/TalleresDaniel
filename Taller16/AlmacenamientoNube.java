package Taller16;

import java.util.HashMap;
import java.util.Map;

//Ejercicio #2:

//Clase AlmacenamientoNube
public class AlmacenamientoNube implements Almacenamiento {
    //Simulamos el almacenamiento en la nube usando HashMap
    private Map<String, String> archivos = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        archivos.put(nombre, contenido);
        System.out.println("Archivo \"" + nombre + "\" guardado en la nube.");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        String contenido = archivos.get(nombre);
        if (contenido != null) {
            System.out.println("Archivo \"" + nombre + "\" recuperado de la nube.");
        } else {
            System.out.println("Archivo \"" + nombre + "\" no encontrado en la nube.");
        }
        return contenido;
    }
}