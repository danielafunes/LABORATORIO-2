package Clases;

public class Proveedor {
    
    private String nombre = null;
    private String apellido = null;
    private String correo = null;
    private String nit = null;
    private String dui = null;
    private String telefono = null;
    private int productos[] = null;
    
    public Proveedor () {
        this.productos = new int[20];
        for (int i = 0; i < this.productos.length; i++) {
            this.productos[i] = 0;
        }
    }
    
    public Proveedor (String nombre, String apellido, String correo, String nit, String dui, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nit = nit;
        this.dui = dui;
        this.telefono = telefono;
    }
    
    public void vincularProducto (int productIndex) {
        for (int i = 0; i < this.productos.length; i ++) {
            if (this.productos[i] == 0) {
                this.productos[i] = productIndex;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
