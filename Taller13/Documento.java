package Taller13;

//Ejercicio #2:

//Clase Documento
public class Documento {
    //Se declara como protected para que las clases derivadas puedan acceder al contenido
    protected String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    //Metodo para exportar a PDF
    public void exportar() {
        System.out.println("Exportando a PDF: " + contenido);
    }
}