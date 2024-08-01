package org.bolsa.Interfaces;
import java.util.List;
public interface IOperacionesCRUD<T> {
    T buscarPorId(int id);
    void agregar(T t);
    List<T> listar();
    void editar(T t, int id);
    void eliminar(int id);



}
