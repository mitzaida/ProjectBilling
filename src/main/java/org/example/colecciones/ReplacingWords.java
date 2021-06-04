package org.example.colecciones;

import java.util.Arrays;
import java.util.HashMap;

public class ReplacingWords {

    public static void main(String[] args) {
        String unaCadena = "abcdinicio jklñ asdf jklñ asdf jklñ abcdfin";
        int indices[] = new int[1000];
        String sources[] = new String[1000];
        String targets[] = new String[1000];

        String newCadena = cambiarCadena(unaCadena, indices, sources, targets);


    }  // Fin Main


    public static String cambiarCadena(String unaCadena, int indices[],
                                       String sources[], String targets[]) {

        HashMap<Integer, String> mapaWord = new HashMap<Integer, String>();

        if (unaCadena.length() <= 0) {
            System.out.println("cadena vacia.");
            return " ";
        }
        int match[] = new int[unaCadena.length()];
        Arrays.fill(match, -1);

        for (int i = 0; i < indices.length; i++) {

            if (unaCadena.substring(indices[i], indices[i] + sources[i].length()).equals(sources[i])
            ) {
                match[indices[i]] = i;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < unaCadena.length(); ) {
            if (match[i] != -1) {
                sb.append(targets[match[i]]);
                i += sources[match[i]].length();
            } else {
                sb.append(unaCadena.charAt(i));
                i++;
            }
        }


        return sb.toString();
    }


}  // Fin Clase ReplacingWords


