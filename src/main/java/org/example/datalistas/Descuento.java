package org.example.datalistas;
import java.util.ArrayList;

public class Descuento {
    private int iddes;
    private int coddes;
    private String desdes;
    int rate;

    public ArrayList<Descuento> descuentos = new ArrayList<Descuento>();


    public Descuento() {}

    public Descuento (int iddes, int coddes, String desdes, int rate) {
        this.iddes = iddes;
        this.coddes = coddes;
        this.desdes = desdes;
        this.rate   = rate;
    }

    public void cargaListaDescuento () {
        descuentos.add(new Descuento(0,1,"Desccto x Empresa",7));
        descuentos.add(new Descuento(1,2,"Descto x Buena Experiencia",3));
        descuentos.add(new Descuento(2,2,"Descto x Lote",10));
    }

    public String getDatosDescuento() {
        return iddes+" "+coddes+" "+ desdes +" "+ rate;
    }

    public int getCoddes() {
        return coddes;
    }

    public int getRate() {
        return rate;
    }

    public String getDesdes() {
        return desdes;
    }
}
