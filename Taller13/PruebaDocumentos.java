package Taller13;

//Ejercicio #2:
public class PruebaDocumentos {
    public static void main(String[] args) {
        Documento docPDF = new Documento("Contenido del documento en PDF");
        Documento docWord = new DocumentoWord("Contenido del documento en Word");
        Documento docExcel = new DocumentoExcel("Contenido del documento en Excel");

        docPDF.exportar();
        docWord.exportar();
        docExcel.exportar();
    }
}