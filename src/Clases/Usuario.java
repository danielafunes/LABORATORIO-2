package Clases;

public class Usuario {
    
    private String usuario = null;
    private String contraseña = null;
    
    public static boolean sesion = false;
    
    public Usuario () {
        this.usuario = null;
        this.contraseña = null;
    }
    
    public Usuario (String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
