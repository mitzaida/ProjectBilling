package org.example.datalistas;

import java.util.ArrayList;

public class Cajero {
    private int idcaj = 1;
    private int codcaj;
    private String nomcaj;

    public ArrayList<Cajero> cajeros = new ArrayList<>();

    public Cajero(int idcaj, int codcaj, String nomcaj) {
        this.idcaj = idcaj;
        this.codcaj = codcaj;
        this.nomcaj = nomcaj;
    }

    public Cajero() {

    }

    public void cargaListaCajero() {
        cajeros.add(new Cajero(0, 1, "Neiro Díaz"));
        cajeros.add(new Cajero(1, 2, "Mitzaida Medina"));
        cajeros.add(new Cajero(2, 3, "Astrid Martinez"));
    }

    public String getMostrarDatosCajero() {
        return idcaj+" "+codcaj+" "+nomcaj;
    }
}
