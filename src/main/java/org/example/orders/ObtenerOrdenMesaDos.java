package org.example.orders;

import java.util.Scanner;

public class ObtenerOrdenMesaDos {
    public int capturarOrden(int recogidas) {
        Scanner mesas = new Scanner(System.in);
        System.out.println("Ingresa Cantidad de Mesas tomadas en el turno: " + recogidas);
        int canMesas = mesas.nextInt();
        return canMesas;
    }
}
