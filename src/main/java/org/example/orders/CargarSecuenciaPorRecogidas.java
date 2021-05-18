package org.example.orders;
import java.util.TreeSet;

public class CargarSecuenciaPorRecogidas {
    public static TreeSet<Integer> seqOrdenMesasPorRecogida = new TreeSet<>();

    public static TreeSet<Integer> cargarSecuenciaMesasPorR(int canMesasPorRecogida) {
        int nroAleatorio = 0;
        if (!seqOrdenMesasPorRecogida.isEmpty()) { seqOrdenMesasPorRecogida.clear();}
        for (; ; ) {
            nroAleatorio = (int) Math.floor(Math.random() * (12 - 1 + 1));
            seqOrdenMesasPorRecogida.add(nroAleatorio); // Lleno la secuencia con aleatorios.
            if (seqOrdenMesasPorRecogida.size() == canMesasPorRecogida) { break; }
        }
        return seqOrdenMesasPorRecogida;
    }
}
