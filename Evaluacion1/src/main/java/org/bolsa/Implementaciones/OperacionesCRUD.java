package org.bolsa.Implementaciones;

import org.bolsa.Interfaces.IOperacionesCRUD;
import org.bolsa.Modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class OperacionesCRUD<T extends Producto> implements IOperacionesCRUD<T> {
    List<T> productos;

    public OperacionesCRUD(){
        productos = new ArrayList<>();
    }
    @Override
    public T buscarPorId(int id) {
        for(T t: productos){
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }

    @Override
    public void agregar(T t) {
        productos.add(t);
    }

    @Override
    public List<T> listar() {
        return productos;
    }

    @Override
    public void editar(T t, int id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                t.setId(id);
                productos.set(i, t);
                break;
            }
        }
    }

    @Override
    public void eliminar(int id) {
        productos.removeIf(t -> t.getId() == id);
    }
}
