public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente c1 = new Cliente(1, "Gabriel", "gabo@lonchezon.com", "1234", "2025-11-21", "2025-11-21");

        // Crear productos
        Producto p1 = new Producto(1, "Paracetamol", 25.0, 1, "Genérico", "2026-05-01");
        Medicamento m1 = new Medicamento(2, "Amoxicilina", 48.0, 1, "Farmacias Similares", "2026-10-15",
                1, 2, "Jarabe");

        // Crear venta
        Venta v1 = new Venta(1001, "2025-11-21", c1);
        v1.agregarProducto(p1);
        v1.agregarProducto(m1);

        // Mostrar ticket
        v1.generarTicket();

        // Guardar en archivo
        ArchivoHelper.guardarVenta(v1, "ventas.txt");

        // Leer archivo
        System.out.println("\n=== Ventas guardadas en archivo ===");
        ArchivoHelper.leerArchivo("ventas.txt");
        Venta v2 = new Venta(1001, "2025-11-21", c1);

// Intentar vender más de lo disponible
        v1.agregarProducto(p1, 5); // Si p1 tiene solo 1 unidad, esto lanza excepción
        v1.agregarProducto(m1, 1); // Esto sí se agrega

        v1.generarTicket();

// Crear producto vencido
        Producto pCaducado = new Producto(3, "Jarabe Tos", 60.0, 2, "Genérico", "2024-01-01");

// Intentar vender producto vencido
        v1.agregarProducto(pCaducado, 1);

    }
}
