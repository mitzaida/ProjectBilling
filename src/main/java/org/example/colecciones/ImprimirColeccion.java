package org.example.colecciones;
import java.util.Map;
import java.util.Set;

public class ImprimirColeccion {

    public void imprimir(Map<String, String> myColeccion, Set<Map.Entry<String, String>> contenido){
        System.out.println("\nValores de la Colección myColeccion  : \n" + myColeccion);
        System.out.println("\nValores de la var contenido de tipo Mapa : \n" + contenido);

        System.out.println("\n******* Comienza el ciclo For.********");
        System.out.println("\n Los valores son de la var del FOR llamada contenidoDos using M. Map.Entry<>" );

        for (Map.Entry<String, String> contenidoDos : myColeccion.entrySet()) {
            System.out.println(contenidoDos);
        }

        System.out.println("\nFuera del For, esto es el objeto myColeccion sin " +
                "editar, es decir, la colección y ya :  \n" + myColeccion);
    }

    public void imprimirFor(Map<String, String> myColeccion){
        System.out.println("\n******* Comienza el ciclo For YA ELIMINADO UN ELEMENTO.XXXXXXXXX");
        for (Map.Entry<String, String> contenidoTres : myColeccion.entrySet()) {
            System.out.println(contenidoTres);
        }
    }


}
