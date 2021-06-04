package org.example.colecciones;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ManejarColeccion {

    public Map<String, String> cargarColeccion() {
        Map<String, String> diccionario = new LinkedHashMap<String, String>();
//        HashMap<String, String> diccionarioDos = LinkedHashMap<String, String>();

        diccionario.put("1Key ","        Valor de Key 1");
        diccionario.put("2Key ","        Valor de Key 2");
        diccionario.put("3Mitzaida", "   Valor de Key 3");
        diccionario.put("4Key ","        Valor de Key 4");
        diccionario.put("5Key ","        Valor de Key 5");

        return diccionario;
    }

    public Map<String, String> eliminarElementoColeccion(Map<String, String> myColeccion, String elemento) {
        myColeccion.remove(elemento);
        return myColeccion;
    }

}
