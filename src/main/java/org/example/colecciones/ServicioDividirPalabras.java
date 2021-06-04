package org.example.colecciones;

import java.util.Arrays;
import java.util.HashMap;

public class ServicioDividirPalabras {

    public String[] cargarPalabrasOriginales(String cadenaOriginal) {
        int longCO = cadenaOriginal.length();

        // Array por palabras separadas desde la cadena.
        String cadaPalabra[] = new String[longCO];

        //Lleno los arreglos con blancos.
        Arrays.fill(cadaPalabra, " ");

        int posicionIni = 0;
        int contador = 0;
        for (int i = 0; i < longCO; i++) {
            if (cadenaOriginal.charAt(i) == ' ' && i > 0) {
                cadaPalabra[contador] = cadenaOriginal.substring(posicionIni, i);
                posicionIni = i + 1;
                contador++;
            }
        }

        //Proceso la last palabra de la cadena.
        cadaPalabra[contador] = (  cadenaOriginal.substring(cadenaOriginal.length() -
                                   (cadenaOriginal.length() - posicionIni) )  ) ;

        return cadaPalabra;
    }



}
