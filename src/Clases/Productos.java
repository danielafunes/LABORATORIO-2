package Clases;

public class Productos {
    
    private int stock = 0;
    private String name = null;
    private double precio = 0.0;
    private Empresa empresa = null;
    
    public Productos () {
        
    }
    
    public Productos (int stock, String name, double precio, Empresa empresa) {
        this.stock = stock;
        this.name = name;
        this.empresa = empresa;
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
