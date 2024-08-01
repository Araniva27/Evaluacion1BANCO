package org.bolsa;

import org.bolsa.Implementaciones.BolsaSupermercado;
import org.bolsa.Modelos.BolsaSupermercadoModelo;
import org.bolsa.Modelos.Fruta;
import org.bolsa.Modelos.Limpieza;

public class PruebaBolsa {
    public static void main(String[] args) {
        BolsaSupermercadoModelo<Fruta> bolsaFruta = new BolsaSupermercadoModelo<Fruta>();
        bolsaFruta.addProducto(new Fruta("Manzana",2.0,7,"amarillo"));
        bolsaFruta.addProducto(new Fruta("Fresa",3.0,7,"rojo"));
        System.out.println(bolsaFruta.mostrarDatos());

        BolsaSupermercadoModelo<Limpieza> bolsaLimpieza = new BolsaSupermercadoModelo<Limpieza>();
        bolsaLimpieza.addProducto(new Limpieza("Toalla",2.78, "Tela",2));
        bolsaLimpieza.addProducto(new Limpieza("Detergente",7.58, "Quimicos",5));
        System.out.println(bolsaLimpieza.mostrarDatos());
    }
}
