package org.example.neiro;

import org.example.neiro.model.Factura;

public class ProcesarPagos {


    public boolean procesar(Factura factura, double valor) {

        if (valor >= factura.getTotalNeto()) {
            return true;
        } else {
            return false;
        }

    }

}
