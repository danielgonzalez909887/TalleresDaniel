package Taller16;

//Ejercicio #3:

//Clase GestorReportes
public class GestorReportes {
    private GeneradorReporte generador;

    //Inyeccion de dependencia mediante el constructor
    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void setGeneradorReporte(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String contenido) {
        generador.generarReporte(contenido);
    }
}