package org.bolsa.Implementaciones;

import org.bolsa.Interfaces.IBolsaSupermercado;
import org.bolsa.Modelos.*;

import java.util.ArrayList;
import java.util.List;

public abstract class BolsaSupermercado<T> extends Producto implements IBolsaSupermercado<T> {
    private List<T> bolsaProductos;
    private static final int MAX_PRODUCTOS = 5;
    public BolsaSupermercado(){
        bolsaProductos = new ArrayList<>();
    }

    @Override
    public void addProducto(T t) {
        if(bolsaProductos.size() < MAX_PRODUCTOS){
            bolsaProductos.add(t);
        }else{
            System.out.println("La bolsa ha alcanzado el máximo de productos");
        }
    }

    @Override
    public List<T> getProductos() {
        return bolsaProductos;
    }

    @Override
    public String mostrarDatos() {
        StringBuilder datos = new StringBuilder();
        for (T producto : bolsaProductos) {
            if (producto instanceof Fruta) {
                datos.append(((Fruta) producto).imprimirDatos()).append("\n");
            } else if (producto instanceof Lacteos) {
                datos.append(((Lacteos) producto).imprimirDatos()).append("\n");
            } else if (producto instanceof Limpieza) {
                datos.append(((Limpieza) producto).imprimirDatos()).append("\n");
            }else if (producto instanceof NoPerecible) {
                datos.append(((NoPerecible) producto).imprimirDatos()).append("\n");
            } else {
                datos.append(producto.toString()).append("\n");
            }
        }
        return datos.toString();
    }
}
