package org.bolsa.Modelos;

import org.bolsa.Interfaces.Imprimir;

public class NoPerecible extends Producto implements Imprimir {
    private int contenido;
    private int calorias;
    private static int contadorProductos = 0;

    public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
        contadorProductos = ++contadorProductos;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "NoPerecible{" +
                "contenido=" + contenido +
                ", calorias=" + calorias +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public String imprimirDatos() {
        return "Id = " + this.getId() +
                " Nombre del producto: " + this.getNombre() +
                " Precio ($): " + this.getPrecio() +
                " Calorias : " + this.getCalorias()+
                " Contenido: " +this.getContenido();
    }
}
