package Taller13;

//Ejercicio #2:

//Clase DocumentoWord
public class DocumentoWord extends Documento {

    public DocumentoWord(String contenido) {
        super(contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando a Word: " + contenido);
    }
}