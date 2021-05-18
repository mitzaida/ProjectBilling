package org.example.orders;
import static org.example.orders.ObtenerRecogidas.*;
import static org.example.orders.ObtenerCanMesasPorR.*;
import static org.example.orders.CargarSecuenciaPorRecogidas.*;

public class Kitchen {

    public static void main(String[] args) {
        cantidadRecogidas();
        System.out.print("\n  *****  Cantidad Total de Recogidas: " + canRecogidas + "   ***** \n");

        for (int i=1; i <= canRecogidas ; i++) {
            System.out.print("\n Cantidad de Mesas para la Recogida Nro. " + (i) + " son : " );
            ObtenerCanMesasPorR.cantidadMesasPorRecogida(i);
            CargarSecuenciaPorRecogidas.cargarSecuenciaMesasPorR(canMesasPorRecogida);
            ImprimirSecuenciasOrdenadas.imprimirMesas(canMesasPorRecogida, seqOrdenMesasPorRecogida);
        }
    }
}
