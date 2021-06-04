package org.example.colecciones;

import java.util.Arrays;

public class SustitucionPalabrasDos {
    public static void main(String[] args) {
        String originalString = "abcd efgh ijkl mnño pqrs";
        int indexes[] = {0 , 2, 5, 7, 10, 13, 15 };
        String sources[] = {"a" , "cd", "ef", "g", "ij", "m" , "mn"};
        String targets[] = {"reep" , "lazo", "de pa", "labra", "mapping", "ñññññññ5" , "xxxx7"};
        findAndReplaceString(originalString, indexes, sources, targets);
    }  // Fin del Main.


    public static String findAndReplaceString (String originalString, int[] indexes,
                                               String[] sources, String[] targets) {
        int n = originalString.length();
        int match[] = new int[n];
        Arrays.fill(match, -1);

        System.out.println("\n Valor de orginalString :\n *******  " + originalString + " *******\n");
        System.out.println("Valores de Indexes : " );
        for (int i=0 ; i < indexes.length ; i++) {
            System.out.print(indexes[i]+ "  " );
        }

        System.out.println("\n");
        System.out.println("Valores de Sources : " );
        for (int i=0 ; i < sources.length ; i++) {
            System.out.print(sources[i]+ "  " );
        }

        System.out.println("\n");
        System.out.println("Valores de Targets : " );
        for (int i=0 ; i < targets.length ; i++) {
            System.out.print(sources[i]+ "  " );
        }
        System.out.println("\n");


        // Recorro el array según la cantidad de indexes dada
        for (int i=0 ; i < indexes.length ; i++) {
            int ix = indexes[i];  // ix tendrá el valor de indexes que es la posición las que voy a comparar para cambiar.
//            System.out.println(" i : " + i);
//            System.out.println(" Valor ix : " + ix + "  Valor en array indexes[i]" + indexes[i]);
//            System.out.println(" Valor de sources en [i] : " + sources[i]);
//            System.out.println(" Longitud del valor de sources en [i].length() : " + sources[i].length());
//            System.out.println("-----------\n");
//
//            String subCadena = originalString.substring ( ix , (ix + sources[i].length() ));
//            String valorSourcePosition = (sources[i]) ;
//            System.out.println("Valores separados para analizar.");
//            System.out.println("subCadena substring (ix,ix+long sources[i] : " + subCadena);
//            System.out.println("valorSourcePosition en i: " + sources[i]);
//            System.out.println("-----------\n");

            // Desde 1er valor de indexes hasta (1er valor de indexex+long del valor de souce en posicioni i).equals
            //valor de source en la posición i.
            // Un arreglo con los que hagan match y guardo el valor del indice, dejando asi en el array
            // los valores con -1 de los que NO hicieron match.
            if(originalString.substring ( ix , (ix + sources[i].length() )).equalsIgnoreCase(sources[i]) ) {
                match[ix] = i ;
                System.out.println(" Se cumplió equals  para hacer  match[ix]= -1 : " + match[ix] + "\n");
            }
        }

        // Ya revisados los valores y comparados con la cadena original
        StringBuilder answer = new StringBuilder();

        int index = 0;
        while (index < n ){
            //Valido los q hicieron match
            if (match[index] >=0) {
                answer.append(targets[match[index]]);
                index += sources[match[index]].length();

            } else {
                // los que no van a cambiar porque NO hicieron match.
                answer.append(originalString.charAt(index++));
            }
        }
        System.out.println("*******************************************************************************");
        System.out.println("String builder SUSTITUIDA:  " + answer.toString());
        System.out.println("******************************************************************************");

        return answer.toString();
    }
}
