public class Medicamento extends Producto {
    private int esAntibiotico; // 1 sí, 0 no
    private int cantidadMaximaPorReceta;
    private String tipo; // pastilla, jarabe, supositorio

    public Medicamento(int id, String nombre, double precio, int estatus, String marca, String caducidad,
                       int esAntibiotico, int cantidadMaximaPorReceta, String tipo) {
        super(id, nombre, precio, estatus, marca, caducidad);
        this.esAntibiotico = esAntibiotico;
        this.cantidadMaximaPorReceta = cantidadMaximaPorReceta;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: " + tipo + " | Antibiotico: " + (esAntibiotico == 1 ? "Sí" : "No");
    }
}
