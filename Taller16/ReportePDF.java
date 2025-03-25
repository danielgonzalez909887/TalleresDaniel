package Taller16;

//Ejercicio #3:

//Clase ReportePDF
public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        //Simulacion de la generacion de un reporte PDF
        System.out.println("Generando reporte en PDF con el siguiente contenido:");
        System.out.println(contenido);
    }
}