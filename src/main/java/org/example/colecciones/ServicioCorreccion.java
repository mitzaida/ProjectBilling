package org.example.colecciones;

import java.util.HashMap;

public class ServicioCorreccion {

    public HashMap<String, String> cargarPalabrasASustituir() {

        HashMap<String, String> mapaAutoCorreccion = new HashMap<String, String>();

        mapaAutoCorreccion.put("machy"    , "era_machy");
        mapaAutoCorreccion.put("medina"   , "era_medina");
        mapaAutoCorreccion.put("prueba"   , "era_prueba");
        mapaAutoCorreccion.put("jugando"  , "era_jugando");
        mapaAutoCorreccion.put("porque"   , "era_porque");
        mapaAutoCorreccion.put("programar", "era_programar");
        mapaAutoCorreccion.put("viajar"   , "era_viajar");
        mapaAutoCorreccion.put("estudiar" , "era_estudiar");
        mapaAutoCorreccion.put("comer"    , "era_comer");
        mapaAutoCorreccion.put("ferbienes" , "FB_era_ferbienes");
        mapaAutoCorreccion.put("millonario"    , "magnate_era millonario");


        return mapaAutoCorreccion;
    }
}
