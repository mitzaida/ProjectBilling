package org.example.neiro;

import com.example.model.Item;
import com.example.model.ItemFactura;
import org.example.neiro.model.Factura;
import org.example.neiro.model.Inventario;

import java.util.List;

public class ProcesarFactura {

    public void procesar(ProcesarPagos procesarPagos, Inventario inventario, Factura factura, double valorPago) {

        List<ItemFactura> itemsFactura = factura.getItems();

        for (ItemFactura itFact : itemsFactura) {
            inventario.procesarItem(itFact.getItem(), itFact.getCantidad());
        }

        realizarCalculo(factura);
        boolean pagoAceptado = procesarPagos.procesar(factura, valorPago);

        if (!pagoAceptado) {
            for (ItemFactura itFact : itemsFactura) {
                inventario.ingresarItem(itFact.getItem(), itFact.getCantidad());
            }
        } else {
            mostrarFactura(factura, valorPago);
        }

        imprimirFactura(factura, pagoAceptado);
    }

    private void imprimirFactura(Factura factura, boolean pagoAceptado) {
        if (!pagoAceptado) {
            System.out.println("El pago no pudo ser procesado!");
        } else {
            System.out.println("El pago pudo ser procesado!");
        }
    }

    private void mostrarFactura(Factura factura, double valorPago) {

        System.out.printf("----------- DETALLES FACTURA -----------");
        System.out.printf("\nNro Factura: %d", factura.getCod());
        System.out.printf("\nCod Cajero: %d", factura.getCodCaj());
        System.out.printf("\nNom Cliente: %d", factura.getClientName());
        System.out.printf("\n--------------------------------------------------------------");
        System.out.printf("\nProducto --------- Precio --------- Descuento --------- Neto");
        List<ItemFactura> detalles = factura.getItems();
        for (ItemFactura itFac : detalles) {
            Item it = itFac.getItem();
            System.out.printf("\n%s \t %f \t %d \t %f ",
                    it.getName(), it.getPrice(), it.getDiscount(), it.getPrice() * (1 - (it.getDiscount() / 100)));
        }
        System.out.printf("\n--------------------------------------------------------------");
        System.out.printf("\nTotal Bruto: %f", factura.getTotalBruto());
        System.out.printf("\nTotal Descuento: %f", factura.getTotalDescuento());
        System.out.printf("\nTotal Neto: %f\n", factura.getTotalNeto());
        System.out.printf("\nCambio: %f\n", valorPago - factura.getTotalNeto());
    }

    private void realizarCalculo(Factura factura) {
        double totalNeto = 0;
        double totalBruto = 0;
        double totalDescuento = 0;

        for (ItemFactura it : factura.getItems()) {
            totalNeto += it.getItem().getPrice() * (1 - (it.getItem().getDiscount() / 100));
            totalBruto += it.getItem().getPrice();
        }
        factura.setTotalNeto(totalNeto);
        factura.setTotalBruto(totalBruto);
        factura.setTotalDescuento(totalBruto - totalNeto);
    }
}  //  Fin de LastProcesarFactura

