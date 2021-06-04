package org.example.orders;
import java.util.Random;
import java.util.TreeSet;

public class CargarSecuenciaMesas {

    public TreeSet<Integer> asignarSecuencias(int canMesas) {

        TreeSet<Integer> seqMesas = new TreeSet<Integer>();

        int nroAleatorio = 0;
        if ( !seqMesas.isEmpty()) {
            seqMesas.clear();
        }


        for (; ; ) {
            nroAleatorio = (int) Math.floor(Math.random() * 13);
             if (nroAleatorio>0) {
                seqMesas.add(nroAleatorio);
            }
            if (seqMesas.size() == canMesas) {
                break;
            }
        }
        return seqMesas;
    }
}
