public class Golosina extends Producto {
    private boolean esNatural;

    public Golosina(int idProducto, String nombre, double precio, int cantidad, String marca, String fechaCaducidad, boolean esNatural) {
        super(idProducto, nombre, precio, cantidad, marca, fechaCaducidad);
        this.esNatural = esNatural;
    }

    public boolean isEsNatural() {
        return esNatural;
    }

    @Override
    public String toString() {
        return super.toString() + " | Natural: " + (esNatural ? "Sí" : "No");
    }
}
