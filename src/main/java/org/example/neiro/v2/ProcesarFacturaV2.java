package org.example.neiro.v2;

import com.example.model.Item;
import com.example.model.ItemFactura;
import org.example.neiro.ProcesarPagos;
import org.example.neiro.model.Factura;
import org.example.neiro.model.Inventario;

import java.util.List;

public class ProcesarFacturaV2 {

    private GenerarReporte generarReporte;
    private ProcesarPagos procesarPagos;
    private Inventario inventario;

    public ProcesarFacturaV2(ProcesarPagos procesarPagos, Inventario inventario) {
        this.inventario = inventario;
        this.procesarPagos = procesarPagos;
        this.generarReporte = new GenerarReporte();
    }

    public ProcesarFacturaV2(ProcesarPagos procesarPagos, Inventario inventario, GenerarReporte generarReporte) {
        this.inventario = inventario;
        this.procesarPagos = procesarPagos;
        this.generarReporte = generarReporte;
    }

    public void procesar(Factura factura, double valorPago) {

        List<ItemFactura> itemsFactura = factura.getItems();

        for (ItemFactura itFact : itemsFactura) {
            inventario.procesarItem(itFact.getItem(), itFact.getCantidad());
        }

        calcular(factura);
        boolean pagoAceptado = procesarPagos.procesar(factura, valorPago);

        if (!pagoAceptado) {
            for (ItemFactura itFact : itemsFactura) {
                inventario.ingresarItem(itFact.getItem(), itFact.getCantidad());
            }
        }
        generarReporte.procesar(factura, pagoAceptado);
    }

    private void calcular(Factura factura) {
        double totalNeto = 0;
        double totalBruto = 0;

        for (ItemFactura itFact : factura.getItems()) {
            Item it = itFact.getItem();
            totalNeto += it.getPrice() * (1 - (it.getDiscount() / 100d)) * itFact.getCantidad();
            totalBruto += it.getPrice();
        }
        factura.setTotalNeto(totalNeto);
        factura.setTotalBruto(totalBruto);
        factura.setTotalDescuento(totalBruto - totalNeto);
    }
}

