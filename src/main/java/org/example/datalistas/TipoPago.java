package org.example.datalistas;

import java.util.ArrayList;

public class TipoPago {
    private int idpago;
    private int codpag;
    private String despag;

    public ArrayList<TipoPago> tipopagos = new ArrayList<TipoPago>() ;

    //Constructor con parms
    public TipoPago(int idpago, int codpag, String despag) {
        this.idpago = idpago;
        this. codpag = codpag;
        this.despag = despag;
    }

    //Constructor con parms
    public TipoPago() {}

    public void cargaListaTipoPago () {
        tipopagos.add(new TipoPago(0,1,"Efectivo Pesos CO"));
        tipopagos.add(new TipoPago(1,2,"Efectivo $$$"));
        tipopagos.add(new TipoPago(2,3,"Transferencias"));
        tipopagos.add(new TipoPago(3,4,"Tarjeta Débito"));
        tipopagos.add(new TipoPago(4,5,"Tarjeta Crédito"));
    }

    public String getCargaListaTipoPago() {

        return idpago +" " +codpag +" "+ despag;
    }

}
