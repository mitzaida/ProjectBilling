package org.example.colecciones;

import java.util.*;

/**
 * 29-05-2021
 * Recibo una cadena con n nro de palabras en ella.
 * La cadena puede tener lowercases and uppercases letters y se ignorará.
 * La cadena está en un language específico
 * Si el lenguage de la cadena es uno de los permitidos (all except chinese, corean, japanese),
 * then
 * procedo a separar la cadena en palabas o grupos de caracteres,
 * else, no hago nada.
 * Separación en palabras o grupos de caracteres - fuente posterior de comparación:
 * Se ubican los espacios en blanco en la cadena para hacer la separación.
 * Cada palabra o conjunto de caracteres unidos y logrados separar por un espacio en blanco, se
 * debe guardar en una estructura, para recorrer una por una y hacer comparaciones.
 * Se debe tener habilitado o disponible un Diccionario de Auto-Corrección de Palabras.
 * Esta tabla de Auto-Corrección debe poseer 3 parámetros:
 * a) language a utilizar
 * b) la palabra key a ubicar
 * c) la palabra que sustituye la palabra key a buscar
 * <p>
 * Se debe comparar el language de la cadena con el language de la tabla de Auto-Corrección
 * Se debe comparar cada palabra fuente de ese language con la palabra key de la tabla de Auto-Corrección
 * Si hay match y no es null
 * Se debe armar otro arreglo o utilizar alguna estructura en java,
 * llenando ésta estructura con la palabra que sustituye en la misma posición que
 * representa la palabra fuente en la 1ra estructura o array.
 * Leer la sig. palabra fuente - volver 23 de este IDE.
 * Al finalizar la comparación de todas las palabras fuentes contra la tabla de Auto-Corrección, se
 * debe armar la new cadena con las palabras definitivas (sustituidas o no) y en el mismo
 * language original de la cadena.
 */

public class SustitucionPalabra {

    public static void main(String[] args) {
        ServicioCorreccion autocorrec = new ServicioCorreccion();
        ServicioDividirPalabras divide = new ServicioDividirPalabras();
        ServicioSustituirPalabras sustituir = new ServicioSustituirPalabras();
        ImprimirCaption caption = new ImprimirCaption();
        Scanner cadenaEntrada  = new Scanner(System.in);
        // Declarar y Llenar el Mapa de Auto-Corrección
        HashMap <String, String> mapaAutoCorreccion = autocorrec.cargarPalabrasASustituir();

        System.out.println("Introduce la cadena original: ");
        String cadenaOriginal = cadenaEntrada.nextLine();


        // Declara y llena el arreglo Dividiendo las palabras de la cadenaOriginal.
        // Llena new array con las palabras originales y SUSTITUIDAS si aplica.
        String cadaPalabra[] = divide.cargarPalabrasOriginales(cadenaOriginal);
        String newCadaPalabra[] = sustituir.cargarPalabrasSustituidas(cadenaOriginal, mapaAutoCorreccion, cadaPalabra);

        caption.imprimirCadenaFinal(cadenaOriginal, mapaAutoCorreccion, newCadaPalabra);


    }  // fin del MAIN

}  // Fin C. SustitucionPalabra


// machy estuvo jugando y bueno el medina tambien cambiara y la prueba también. Aaron ya no está en ferbienes y tiene que estudiar y no comer tanto para que pueda ser millonario .
// era_machy estuvo jugando y bueno el medina tambien cambiara y la prueba también.