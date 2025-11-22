import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int idVenta;
    private String fecha;
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    public Venta(int idVenta, String fecha, Cliente cliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0;
    }

    // Método para agregar un producto sin validar stock
    public void agregarProducto(Producto p) {
        productos.add(p);
        total += p.getPrecio();
    }

    // Método para agregar un producto con validación de stock y caducidad
    public void agregarProducto(Producto p, int unidades) {
        try {
            p.validarCaducidad(); // ⚡ lanza excepción si está vencido
            p.reducirStock(unidades); // ⚡ lanza excepción si no hay stock
            productos.add(p);
            total += p.getPrecio() * unidades;
        } catch (StockInsuficienteException | ProductoCaducadoException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
    }

    public void generarTicket() {
        System.out.println("=== Ticket de venta #" + idVenta + " ===");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        for (Producto p : productos) {
            System.out.println("- " + p);
        }
        System.out.println("TOTAL: $" + total);
        System.out.println("===============================");
    }

    // 🔑 Getters necesarios
    public int getIdVenta() {
        return idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }
}
