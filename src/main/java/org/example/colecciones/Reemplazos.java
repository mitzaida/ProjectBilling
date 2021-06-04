package org.example.colecciones;

import java.util.HashMap;

public class Reemplazos {

    public static void main(String[] args) {
        String str1 = new String("Prueba con replace solo de un objeto String declarandolo " +
                                         " e instanciandolo y creando otro objeto.");
        String regex = "objeto" ;
        String rep1 = " **machy medina** " ;
        String r1 = str1.replace(regex, rep1);
        System.out.println(str1);
        System.out.println(regex);
        System.out.println(rep1);
        System.out.println(r1  );
        System.out.println("--------------------------------------------");

        str1 = new String("Prueba con replaceAll 222222 de un objeto String declarandolo " +
                " e instanciandolo y creando otro objeto.");
        regex = "\\s" ;
        rep1 = "" ;
        r1 = str1.replaceAll(regex, rep1);
        System.out.println(str1);
        System.out.println(regex);
        System.out.println(rep1);
        System.out.println(r1  );
        System.out.println("--------------------------------------------");


        str1 = new String("Prueba con replaceFirst 33333 de un objeto String declarandolo " +
                " e instanciandolo y creando otro objeto.");
        regex = "s";
        rep1 = "**9**" ;
        r1 = str1.replaceAll(regex, rep1);
        System.out.println(str1);
        System.out.println(regex);
        System.out.println(rep1);
        System.out.println(r1  );
        System.out.println("--------------------------------------------");

        //ejemplo quitando los puntos, comas y los paréntesis, se colocan entre corchetes porque
        // sino toma las barras como comandos.  Usa printf--> print format
        String cadena = "Hola, mundo. Veamos si funciona (probando con esto)";
        String cadenaRemplazada = cadena.replaceAll("[\\.\\,\\(\\)]", "");
        System.out.printf ("Antes:  %s \nDespués:%s \n" , cadena, cadenaRemplazada);


//        HashMap< HashMap<String,String> , String> mapAnidado = new HashMap<>();
//
//        mapAnidado.put(mapAnidado.put("Cliente", "nombre_cliente"), "Language_cliente");

    }
}
