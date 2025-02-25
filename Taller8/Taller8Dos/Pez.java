package Taller8.Taller8Dos;

//Ejercicio #2:

//Clase Pez
public class Pez extends Animal {
    private String tipoDeAgua;
    
    // Constructor que utiliza super para inicializar la especie (atributo de Animal)
    // y además inicializa el atributo tipoDeAgua
    public Pez(String especie, String tipoDeAgua) {
        super(especie); 
        this.tipoDeAgua = tipoDeAgua;
    }
    
    
    public void mostrarDetalles() {
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}