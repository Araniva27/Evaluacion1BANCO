package org.bolsa.Modelos;

import org.bolsa.Interfaces.Imprimir;

public class Lacteos extends Producto implements Imprimir {
    private int cantidad;
    private int proteinas;
    //private static int contadorProductos = 0;
    public Lacteos(String nombre, Double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return "Lacteos{" +
                "cantidad=" + cantidad +
                ", proteinas=" + proteinas +
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
                " Cantidad : " + this.getCantidad()+
                " Proteina: " +this.getProteinas();
    }
}
