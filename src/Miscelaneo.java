public class Miscelaneo extends Producto {
    public Miscelaneo(int idProducto, String nombre, double precio, int cantidad, String marca, String fechaCaducidad) {
        super(idProducto, nombre, precio, cantidad, marca, fechaCaducidad);
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Misceláneo";
    }
}
