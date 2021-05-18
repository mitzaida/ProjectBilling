package org.example.orders;
import javax.swing.*;

public class ObtenerCanMesasPorR {
    public static int canMesasPorRecogida = 0;

    public static void cantidadMesasPorRecogida(int i) {
        canMesasPorRecogida = Integer.parseInt(JOptionPane.showInputDialog
                ("Cant.Ordenes-Mesas para la Recogida Nro. : " + i));


    }
}
