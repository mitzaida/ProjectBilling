package org.example.orders;

import java.util.TreeSet;

public class KitchenDos {

    public static void main(String[] args) {

        ObtenerRecogidasDos rondas = new ObtenerRecogidasDos();
        ObtenerOrdenMesaDos ordenes = new ObtenerOrdenMesaDos();
        CargarSecuenciaMesas secuenciaMesas = new CargarSecuenciaMesas();
        ImprimirSecuenciaDos verSequencias = new ImprimirSecuenciaDos();

        int recogidas = rondas.cantidadRecogidas();

        TreeSet <Integer > seqM; // = secuenciaMesas.asignarSecuencias(canMesas);
        int canMesas = 0;

        for (int i = 1; i <= recogidas; i++) {
            canMesas = ordenes.capturarOrden(i);
            seqM = secuenciaMesas.asignarSecuencias(canMesas);
            verSequencias.imprimirMesas(recogidas, seqM);
        }
    }
}
