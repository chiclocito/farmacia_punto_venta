public class Cliente extends Usuario {
    private String correo;
    private String password;
    private String fechaRegistro;
    private String fechaUltimoAcceso;

    public Cliente(int idUsuario, String nombre, String correo, String password, String fechaRegistro, String fechaUltimoAcceso) {
        super(idUsuario, nombre);
        this.correo = correo;
        this.password = password;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimoAcceso = fechaUltimoAcceso;
    }

    @Override
    public String getRol() {
        return "Cliente";
    }

    public String getCorreo() {
        return correo;
    }
}
