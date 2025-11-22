public class Administrador extends Usuario {
    public Administrador(int idUsuario, String nombre) {
        super(idUsuario, nombre);
    }

    @Override
    public String getRol() {
        return "Administrador";
    }
}
