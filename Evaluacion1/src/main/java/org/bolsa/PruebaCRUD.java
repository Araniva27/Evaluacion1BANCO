package org.bolsa;

import org.bolsa.Implementaciones.OperacionesCRUD;
import org.bolsa.Interfaces.IOperacionesCRUD;
import org.bolsa.Modelos.Fruta;
import org.bolsa.Modelos.Lacteos;

public class PruebaCRUD {
    public static void main(String[] args) {
        IOperacionesCRUD<Lacteos> lacteo = new OperacionesCRUD<Lacteos>();
        lacteo.agregar(new Lacteos("Queso",2.0, 2,5));
        lacteo.agregar(new Lacteos("Crema",5.0, 3,5));

        System.out.println("====Productos registrador====");
        lacteo.listar().forEach(System.out::println);
        System.out.println("====Producto buscador por id====");
        System.out.println("buscado " +lacteo.buscarPorId(1));
        System.out.println("====Producto editado====");
        lacteo.editar(new Lacteos("jabon",2.0,1,7), 1);
        lacteo.listar().forEach(System.out::println);
        System.out.println("====Producto eliminado====");
        lacteo.eliminar(1);
        lacteo.listar().forEach(System.out::println);

        IOperacionesCRUD<Fruta> fruta = new OperacionesCRUD<Fruta>();
        fruta.agregar(new Fruta("Pera",2.0, 2,"verde"));
        System.out.println("====Fruta====");
        fruta.listar().forEach(System.out::println);
    }
}
