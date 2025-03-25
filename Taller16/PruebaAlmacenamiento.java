package Taller16;

//Ejercicio #2:
public class PruebaAlmacenamiento {
    public static void main(String[] args) {
        // Utilizando almacenamiento local
        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestor = new GestorArchivos(local);
        
        gestor.guardar("documento.txt", "Contenido del documento local");
        System.out.println("Contenido: " + gestor.recuperar("documento.txt"));
        
        // Cambiando a almacenamiento en la nube
        Almacenamiento nube = new AlmacenamientoNube();
        gestor.setAlmacenamiento(nube);
        
        gestor.guardar("informe.pdf", "Contenido del informe en la nube");
        System.out.println("Contenido: " + gestor.recuperar("informe.pdf"));
    }
}