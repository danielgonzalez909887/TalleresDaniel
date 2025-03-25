package Taller13;

//Ejercicio #2:

//Clase DocumentoExcel
public class DocumentoExcel extends Documento {

    public DocumentoExcel(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando a Excel: " + contenido);
    }
}