package Taller5.vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moto - Tipo: " + tipo + ", Marca: " + marca + ", Cilindrada: " + cilindrada);
    }
    
}
