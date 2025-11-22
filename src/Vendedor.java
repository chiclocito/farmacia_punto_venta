public class Vendedor extends Usuario {
    public Vendedor(int idUsuario, String nombre) {
        super(idUsuario, nombre);
    }

    @Override
    public String getRol() {
        return "Vendedor";
    }
}

