package org.bolsa.Interfaces;

import org.bolsa.Modelos.BolsaSupermercadoModelo;
import org.bolsa.Modelos.Producto;

import java.util.List;

public interface IBolsaSupermercado<T> {
    void addProducto(T t);
    List<T> getProductos();

    String mostrarDatos();
}
