package org.example.colecciones;

import java.util.Arrays;
import java.util.HashMap;

public class ServicioSustituirPalabras {

    public String[] cargarPalabrasSustituidas(String cadenaOriginal, HashMap<String, String> mapaAutoCorreccion,
                                              String cadaPalabra[]) {
        int longCO = cadenaOriginal.length();

        //Array con las palabras ya sustituidas si las hay.
        String newCadaPalabra[] = new String[longCO];

        //Lleno los arreglos con blancos.
        Arrays.fill(newCadaPalabra, " ");


        for (int i = 0; i < cadaPalabra.length; i++) {
            if (cadaPalabra[i]!= " ") {
                if (mapaAutoCorreccion.containsKey(cadaPalabra[i])) {
                    newCadaPalabra[i] = mapaAutoCorreccion.get(cadaPalabra[i]);
                } else {
                    newCadaPalabra[i] = cadaPalabra[i];
                }
            }
        }

        return newCadaPalabra;
    }
}
