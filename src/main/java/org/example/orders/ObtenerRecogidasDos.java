package org.example.orders;
import java.util.Scanner;

public class ObtenerRecogidasDos {

    public int cantidadRecogidas() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa Cantidad de Recogidas del Mesonero : ");
        return entrada.nextInt();
    }
}
