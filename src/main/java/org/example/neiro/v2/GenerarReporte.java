package org.example.neiro.v2;

import com.example.model.Item;
import com.example.model.ItemFactura;
import org.example.neiro.model.Factura;

import java.util.List;

public class GenerarReporte {

    public void procesar(Factura factura, boolean pagoAceptado) {
        if (!pagoAceptado) {
            System.out.println("El pago no pudo ser procesado!");
        } else {
            System.out.println("El pago pudo ser procesado!");
            imprimirFactura(factura);
        }
    }

    public void imprimirFactura(Factura factura) {

        System.out.printf("\n----------- DETALLES FACTURA -----------");
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
    }
}
