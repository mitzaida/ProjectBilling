package org.example.neiro;

import com.example.model.Item;
import org.example.neiro.model.Factura;
import org.example.neiro.model.Inventario;

public class SistemaFacturacion {

    public static void main(String[] args) {
        Inventario inv = new Inventario();
        ProcesarFactura p = new ProcesarFactura();
        ProcesarPagos pp = new ProcesarPagos();
        Factura factura = new Factura();

        Item a002 = inv.obtenerItemPorCodigo("A002");
        factura.agregarItem(a002, 3);
        p.procesar(pp, inv, factura, 40000);

    }
}
