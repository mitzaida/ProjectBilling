package org.example.datalistas;
import java.util.ArrayList;

public class Item {
    private int iditem;
    private String coditem;
    private String desitem;
    private double precioitem;
    private int cantdispo;

    public ArrayList<Item> items = new ArrayList<>();

    public Item () {}

    public Item (int iditem, String coditem, String desitem, double precioitem, int cantdipo) {
        this.iditem     = iditem;
        this.coditem    = coditem;
        this.desitem    = desitem;
        this.precioitem = precioitem;
        this.cantdispo  = cantdipo;
    }

    public void cargaItemInventario () {
        items.add(new Item(1, "A001", "Martillo",  3500.5 , 6));
        items.add(new Item(2, "A081", "Taladro",   8300.5 , 0));
        items.add(new Item(3, "B120", "tornillo",  500.0  , 5));
        items.add(new Item(4, "B300", "Tubo Acero",1800.0 , 3));
        items.add(new Item(5, "C500", "Tubo Cobre",2305.4 , 0));
        items.add(new Item(6, "C630", "Cemento",   5000.5 , 4));

    }



    public String getDatosItemFactura() {
        return coditem+"           "+desitem+"           "+precioitem;
    }

    public String getCoditem() {
        return coditem;
    }

    public double getPrecioitem() {
        return precioitem;
    }


    public int getCantdispo() {
        return cantdispo;
    }

    @Override
    public String toString() {
        return  iditem+"           "+coditem+ "          "
                +desitem+"              "+precioitem+"         "+cantdispo;
    }

}
