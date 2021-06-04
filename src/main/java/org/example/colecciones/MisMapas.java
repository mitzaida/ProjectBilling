package org.example.colecciones;
import java.util.*;

public class MisMapas {

    public static void main(String[] args) {
        HashMap<String , Empleados> personal = new HashMap<String,  Empleados> ();

        Empleados nombresEmpleados = new Empleados("machy1", 5000);
        personal.put("145", nombresEmpleados );

        //personal.put("146", new Empleados("machy2", 6000) );
        personal.put("Mitzaida", new Empleados("machy2", 6000) );

        Empleados nombresEmpleadosDos = new Empleados("machy3", 7000);
        personal.put("147", nombresEmpleadosDos );

        personal.put("148", new Empleados("machy4", 8000));

        System.out.println("Sin editar la colección: " + personal);



        // Remover un elemento del mapa.
        personal.remove("147");
        System.out.println("Removiendo elemento y sin editar: " + personal);


        //Reemplazar un elemento de un mapa.  Sustituye dejando el last valor asignado cuando ya la clave existe.
        personal.put("148", new Empleados("SANDRA", 8000));
        System.out.println("Reemplazando Elemento y sin Editar: " + personal);


        // Método Entry SET del Mapa, imprime la colección pero como un SET entre [].
        System.out.println("\n Esto es con entrySet() :" +  personal.entrySet());



        // Con un FOR, usamos el Método Map.Entry<> y el entrySet, para obtener la Clave y el Valor.
        System.out.println("\n Comienza el Ciclo FOR para recorrer la colecctión.");
        for(Map.Entry<String, Empleados> entrada : personal.entrySet()) {
            System.out.println("\nEsto es con getKey() Clave: " + entrada.getKey() + " , esto con getValue() Valor = " + entrada.getValue());

            String clave = entrada.getKey();
            Empleados valor = entrada.getValue();
            System.out.println("\nEsto con las vars clave y valor ----> Clave: " + clave + " , Valor = " + valor);


            if (entrada.getKey()=="Mitzaida") {
                personal.put(entrada.getKey(), new Empleados("Mitzy_REEMPLAZADO el KEY", 9000));
            }
        }
        System.out.println("\n Colección Mapa ya fuera del cicor For: \n" +  personal);

    }
}
