package org.bolsa.Modelos;

import org.bolsa.Interfaces.Imprimir;

public class Limpieza extends Producto implements Imprimir {
    private String componentes;
    private double litros;
    private static int contadorProductos = 0;

    public Limpieza(String nombre, Double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
        contadorProductos = ++contadorProductos;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Limpieza{" +
                "componentes='" + componentes + '\'' +
                ", litros=" + litros +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public String imprimirDatos() {
        return "Id = " + this.getId() +
                "Nombre del producto: " + this.getNombre() +
                "Precio ($): " + this.getPrecio() +
                "Componentes : " + this.getComponentes()+
                "Litros: " +this.getLitros();
    }
}
