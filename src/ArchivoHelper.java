import java.io.*;
import java.util.List;

public class ArchivoHelper {

    public static void guardarVenta(Venta venta, String nombreArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            bw.write("Venta #" + venta.getIdVenta() + " | Fecha: " + venta.getFecha() + "\n");
            bw.write("Cliente: " + venta.getCliente().getNombre() + "\n");
            for (Producto p : venta.getProductos()) {
                bw.write("- " + p.toString() + "\n");
            }
            bw.write("TOTAL: $" + venta.getTotal() + "\n");
            bw.write("==============================\n");
        } catch (IOException e) {
            System.out.println("Error al guardar la venta: " + e.getMessage());
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
