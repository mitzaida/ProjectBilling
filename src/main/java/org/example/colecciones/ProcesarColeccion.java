package org.example.colecciones;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ProcesarColeccion {

    public static void main(String [] args) {
        // Instancio en vars de Referencia los objetos.
        ManejarColeccion accionSobreColeccion = new ManejarColeccion();
        ImprimirColeccion resultados = new ImprimirColeccion();

        //Defino vars a utilizar.
        Map<String, String> myColeccion;
        String elemento;

        // Recibo desde el return del M. cargarColeccion que está en la clase ManejarColeccion.
        // También lo asigno a la var contenido.
        myColeccion = accionSobreColeccion.cargarColeccion();
        Set<Map.Entry<String, String>> contenido =  myColeccion.entrySet() ;


        // Imprimo
        resultados.imprimir(myColeccion, contenido);


        //Elimino elemento

        elemento = myColeccion.get("3Mitzaida");
        accionSobreColeccion.eliminarElementoColeccion(myColeccion,elemento);


        // Imprimo  again
        resultados.imprimirFor(myColeccion);

    }
}
