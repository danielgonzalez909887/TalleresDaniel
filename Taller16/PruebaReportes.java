package Taller16;

//Ejercicio #3:
public class PruebaReportes {
    public static void main(String[] args) {
        //Reporte en PDF
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestor = new GestorReportes(reportePDF);
        gestor.crearReporte("Reporte de ventas: $10,000");

        //Reporte en Excel
        GeneradorReporte reporteExcel = new ReporteExcel();
        gestor.setGeneradorReporte(reporteExcel);
        gestor.crearReporte("Reporte de inventario: 250 unidades");
    }
}