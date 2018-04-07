package Clases;

public class Empresa {
    private String nombre = null;
    private String direccion = null;
    private String telefono = null;
    private String fax = null;
    private String website = null;
    private Proveedor proveedor = null;
    
    public Empresa () {
        this.proveedor = new Proveedor();
    }
    
    public Empresa (String nombre, String direccion, String telefono, String fax, String website, Proveedor proveedor) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fax = fax;
        this.website = website;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
