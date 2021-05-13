package org.example.neiro.model;


import com.example.model.Item;
import com.example.model.ItemFactura;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private List<ItemFactura> items;
    private int cod;
    private int codCaj;
    private String clientName;
    private String address;
    private double totalDescuento;
    private double totalBruto;
    private double totalNeto;

    public void agregarItem(Item it, int cantidad) {
        if (items == null) {
            items = new ArrayList<>();
        }

        int posItem = items.indexOf(it);

        if (posItem > -1) {
            ItemFactura producto = items.get(posItem);
            producto.setCantidad(cantidad);
        } else {
            items.add(new ItemFactura(it, cantidad));
        }

    }

    public boolean removerItem(Item it) {
        if (items == null) {
            return false;
        }

        for (ItemFactura itFact : items) {
            if (itFact.getItem().equals(it)) {
                items.remove(itFact);
                return true;
            }
        }

        return false;
    }


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCodCaj() {
        return codCaj;
    }

    public void setCodCaj(int codCaj) {
        this.codCaj = codCaj;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public double getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public double getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(double totalBruto) {
        this.totalBruto = totalBruto;
    }

    public double getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(double totalNeto) {
        this.totalNeto = totalNeto;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }
}
