package org.example.colecciones;

public class ManejarCadena {

    public static void main(String[] args) {
        String cadenaOriginal = "¡{{{{!Esto ***%%%%es una cadena &hasta llegar a la: %1ra (((word, que es la palabra, Esto!.";

        String cadena =
                cadenaOriginal.replaceAll("[\\*\\.\\,\\(\\)\\;\\:\\{\\}\\<\\>\\¿\\?\\¡\\!\\&\\$)\\%]", "");
        StringBuilder sbNExp = new StringBuilder();
        int longi=cadena.length();
        String words[];

        System.out.println("\nCadena full símbolos: \n" +cadenaOriginal+"\n");
        System.out.println("Cadena limpia sin Símbolos: \n" + cadena+"\n\n");

        words = dividirEnPalabras(cadena, longi);
        int longiWords = words.length;

        //New Expresión comenzando palabra x palabra para iterar hasta la
        // ultima palabra para cada caso. De IZQ a Der.
        for (int i=0; i <= longiWords; i++) {
            for (int j=i; j <= longiWords-1 ; j++ ) {
                sbNExp = sbNExp.append(words[j] + " ");
                System.out.println(sbNExp);
            }
            sbNExp.delete(0,sbNExp.length());
            System.out.println("\n");
        }

    } // fin MAIN.


    public static String[] dividirEnPalabras(String cadena, int longi) {
        String words[] = new String[longi];
        System.out.println("Arreglo creado por el split. :");
        for (int i = 0; i < cadena.length(); i++) {
            words = cadena.split(" ");
            if (i < words.length) {
                System.out.println(words[i]);
            }
        }
        System.out.println("\n\n");
        return words;
    }


}  // fin de la clase ManejarCadena








//        //DER a IZQ - al reves -     No lo usaremos.
//        int longiWord=words.length;
//        System.out.println(longiWord);
//        System.out.println("\n\n");
//
//        for (int i = longiWord-1; i > 0; i--) {
//            sbBack = sbBack.append(words[i]+" ") ;
//            System.out.println(sbBack);
//        }
//        System.out.println("\n\n");




//IZQ a DER y reduciendo palabra por palabra de la izq, para obtener
// el resto de la cadena hasta llegar ala última word.   -  Nol usaremos
//        for (int i=0; i <= longiWords; i++) {
//            for (int j=i+1; j<= longiWords-1; j++){
//                sbNExp = sbNExp.append(words[j] + " ");
//            }
//            System.out.println(sbNExp);
//            sbNExp.delete(0,sbNExp.length());
//            System.out.println("ver cual es esta");
//        }