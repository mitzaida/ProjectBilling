package org.example.colecciones;

import java.util.HashMap;

public class ImprimirCaption {

    public void imprimirCadenaFinal (String cadenaOriginal, HashMap<String, String> mapaAutoCorreccion,
                                     String newCadaPalabra[]) {
        System.out.println("\n\n Cadena Original: " + cadenaOriginal + "\n");
        System.out.println("\n\n MAPA Valores para Auto-Correción: " + mapaAutoCorreccion + "\n");
        System.out.println("\n\n División de Palabras en Array cadaPalabra fuera del FOR: \n");

        int longCO = cadenaOriginal.length();
        String cadenaFinal=" ";
        for (int i = 0; i < longCO; i++) {
            if (newCadaPalabra[i] != " ") {
                System.out.println("Array NEWcadenaPalabra imprimir en la consola: " + newCadaPalabra[i]);
                cadenaFinal = cadenaFinal + " " + newCadaPalabra[i];
            }
        }
        System.out.println("\n\n*********************************************");
        System.out.println(" CADENA FINAL: " + cadenaFinal );
        System.out.println("*********************************************");
    }
}
