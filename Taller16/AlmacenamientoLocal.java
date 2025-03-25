package Taller16;

import java.util.HashMap;
import java.util.Map;

//Ejercicio #2:

//Clase AlmacenamientoLocal
public class AlmacenamientoLocal implements Almacenamiento {
    //Simulamos el almacenamiento local usando HashMap
    private Map<String, String> archivos = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        archivos.put(nombre, contenido);
        System.out.println("Archivo \"" + nombre + "\" guardado localmente.");
    }

    @Override
    public String recuperarArchivo(String nombre) {
        String contenido = archivos.get(nombre);
        if (contenido != null) {
            System.out.println("Archivo \"" + nombre + "\" recuperado del almacenamiento local.");
        } else {
            System.out.println("Archivo \"" + nombre + "\" no encontrado en el almacenamiento local.");
        }
        return contenido;
    }
}