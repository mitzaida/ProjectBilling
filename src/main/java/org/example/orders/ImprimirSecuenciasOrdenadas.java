package org.example.orders;
import java.util.TreeSet;

public class ImprimirSecuenciasOrdenadas {

    public static void imprimirMesas(int canMesasPorRecogida, TreeSet<Integer> seqOrdenMesasPorRecogida) {
        System.out.print(canMesasPorRecogida + " Mesas.");
        System.out.println("\n Y los  #s  de Mesas Ordenadas son: " + seqOrdenMesasPorRecogida + "\n");
    }
}
