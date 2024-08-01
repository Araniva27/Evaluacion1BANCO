package org.bolsa.Modelos;

public class Producto {
    protected int id;
    protected String nombre;
    protected Double precio;
    private static int contadorProductos = 0;
    public Producto() {
    }

    public Producto(String nombre, Double precio) {
        this.id = ++contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
