public abstract class Usuario {
    protected int idUsuario;
    protected String nombre;

    public Usuario(int idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getRol();
}

