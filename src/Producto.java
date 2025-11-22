import java.time.LocalDate;

public class Producto {
    private int cantidad;
    private String nombre;
    private double precio;
    private String fechaCaducidad; // formato YYYY-MM-DD

    public Producto(int idProducto, String nombre, double precio, int cantidad, String marca, String fechaCaducidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void reducirStock(int unidades) throws StockInsuficienteException {
        if (unidades > cantidad) {
            throw new StockInsuficienteException("No hay suficiente stock de " + nombre);
        }
        cantidad -= unidades;
    }

    public void validarCaducidad() throws ProductoCaducadoException {
        LocalDate hoy = LocalDate.now();
        LocalDate caducidad = LocalDate.parse(fechaCaducidad);
        if (caducidad.isBefore(hoy)) {
            throw new ProductoCaducadoException("El producto " + nombre + " está caducado (fecha: " + fechaCaducidad + ")");
        }
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
