package Taller16;

//Ejercicio #3:

//Clase ReporteExcel
public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        //Simulacion de la generacion de un reporte Excel
        System.out.println("Generando reporte en Excel con el siguiente contenido:");
        System.out.println(contenido);
    }
}