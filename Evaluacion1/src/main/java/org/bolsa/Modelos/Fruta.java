package org.bolsa.Modelos;

import org.bolsa.Interfaces.Imprimir;

public class Fruta extends Producto implements Imprimir {
    private double peso;
    private String color;

    public Fruta(String nombre, Double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*@Override
    public String toString() {
        return "Fruta{" +
                "peso=" + peso +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }*/

    @Override
    public String imprimirDatos() {
        return "Id = " + this.getId() +
                " Nombre del producto: " + this.getNombre() +
                " Precio ($): " + this.getPrecio() +
                " Peso : " + this.getPeso()+
                " Color: " +this.getColor();
    }
}
