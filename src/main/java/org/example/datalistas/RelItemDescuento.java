package org.example.datalistas;
import java.util.ArrayList;

public class RelItemDescuento {

    private int idrel;
    private String coditem;
    private int coddes;

    public ArrayList<RelItemDescuento> relID = new ArrayList<>();

    Item item = new Item();
    Descuento descuento = new Descuento();

    public RelItemDescuento () {}

    public RelItemDescuento (int idrel, String coditem, int coddes) {
        this.idrel = idrel;
        this.coditem = coditem;
        this.coddes = coddes;
    }

    public void cargaListaItemDescuento() {
        relID.add(new RelItemDescuento(1,"A081",2));
        relID.add(new RelItemDescuento(2,"B300",3));
        relID.add(new RelItemDescuento(3,"C500",1));
        relID.add(new RelItemDescuento(4,"C630",2));
        }


    public int getCoddes () {
        return coddes;
    }

    public String getCoditem () {
        return coditem;
    }

    public String toString (){
        return coditem+ " "+ coddes;
    }

}