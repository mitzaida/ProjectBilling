package org.example.orders;
import javax.swing.*;

public class ObtenerRecogidas {
    public static int canRecogidas = 0;

    public static void cantidadRecogidas() {
        canRecogidas = Integer.parseInt(JOptionPane.showInputDialog(" Cuántos Recogidas son : "));
    }
}
