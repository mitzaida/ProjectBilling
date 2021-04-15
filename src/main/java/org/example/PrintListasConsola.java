package org.example;
import org.example.datalistas.*;
import java.util.Date;


public class PrintListasConsola {

    public static void imprimirEncabezado() {
        System.out.println("             FACTURA # : " + "4444"  +  "                     FECHA : "+ "hoy jajjajajaj"+"\n") ;
        System.out.println("             CAJERO: ");
        System.out.println("             TIPO DE PAGO:"               + "\n"+"\n");

        System.out.println(" Código Item   Descripción Item   Precio Item   Descuento         Precio Item Neto  " );

        System.out.println("____________________________________________________________________________________" );

    }  //  Fin del metodo imprimirEncabezado






    public static void imprimirListas() {

        // Instanciando ArrayList Cajero de tipo Cajero que es la clase e Imprimiendo esa lista en consola just to see.
        Cajero caje1 = new Cajero();
        caje1.cargaListaCajero();

        for (int iz = 0; iz < caje1.cajeros.size(); iz++) {
            String mz1 = caje1.cajeros.get(iz).getMostrarDatosCajero();
            System.out.println(mz1);
        }
        System.out.println("\n");


        // Instanciando ArrayList TipoPago que es de tipo TipoPago que es la clase e Imprimiendo esa lista en consola just to see.
        TipoPago tipopa1 = new TipoPago();
        tipopa1.cargaListaTipoPago();

        for (int iz1 = 0; iz1 < tipopa1.tipopagos.size(); iz1++) {
            String mz2 = tipopa1.tipopagos.get(iz1).getCargaListaTipoPago();
            System.out.println(mz2);
        }
        System.out.println("\n");


        // Instanciando ArrayList Item que es de tipo Item que es la clase e Imprimiendo esa lista en consola just to see.
        Item itemsRefObj = new Item();
        itemsRefObj.cargaItemInventario();

        for (int iz2 = 0; iz2 < itemsRefObj.items.size(); iz2++) {
            String mz3 = itemsRefObj.items.get(iz2).toString();
            //    Item mz3 = itemsRefObj.items.get(iz2);

            System.out.println(mz3);
        }
        System.out.println("\n");


        // Instanciando ArrayList Descuento que es de tipo Descuento que es la clase e Imprimiendo esa lista en consola just to see.
        Descuento descuentoRefObj = new Descuento();
        descuentoRefObj.cargaListaDescuento();;

        for (int iz3 = 0; iz3 < descuentoRefObj.descuentos.size(); iz3++) {
            String mz4 = descuentoRefObj.descuentos.get(iz3).getDatosDescuento();
            System.out.println(mz4);
        }
        System.out.println("\n");


        // Instanciando ArrayList RelItemDescuento, para saber el descuento y el item que lo tiene
        RelItemDescuento relIDRefObj = new RelItemDescuento();
        relIDRefObj.cargaListaItemDescuento();

        System.out.println("Código Descuento");
        for (int iz4 = 0; iz4 < relIDRefObj.relID.size(); iz4++) {
            int mz5 = relIDRefObj.relID.get(iz4).getCoddes();
            System.out.println(mz5);
        }
        System.out.println("\n");

        System.out.println("Código Item que tienen Descuento");
        for (int iz4 = 0; iz4 < relIDRefObj.relID.size(); iz4++) {
            System.out.println(relIDRefObj.relID.get(iz4).getCoditem());
        }
        System.out.println("\n");

        System.out.println("Usando el toString de la clase, imprimo ambos ");
        for (int iz4 = 0; iz4 < relIDRefObj.relID.size(); iz4++) {
            System.out.println(relIDRefObj.relID.get(iz4));
        }

    }
}
