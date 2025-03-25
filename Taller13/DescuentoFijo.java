package Taller13;

//Ejercicio #1:

//Clase DescuentoFijo
public class DescuentoFijo extends Descuento {
    //Representa el descuento fijo en valor monetario
    private double descuentoFijo;

    //Se inicializa con el descuento fijo, por eso se llama al constructor de la superclase con 0.
    public DescuentoFijo(double descuentoFijo) {
        super(0);
        this.descuentoFijo = descuentoFijo;
    }

    //Se sobrescribe el metodo para aplicar un descuento fijo en lugar de un porcentaje
    @Override
    public double aplicarDescuento(double precio) {
        return precio - descuentoFijo;
    }
}