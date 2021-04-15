package org.example;

import org.example.datalistas.*;

// Obtener la lista de los items desde la ArrayList items
// procesar descuento si aplica
// procesar toal factura

public class NewProcesarFactura {

//    private int idfactura;
//    private int numfac;
//    //private date fecfac;
//    private int codcaj;
//    private String nomcaj;
//    private int codpag;
//    private int despag;


    public static void seccionesFacturas() {

        // Imprime cabecera
        // PrintListasConsola.imprimirEncabezado(); // si saco este y lo coloco en otro method, imprime pero no lo veo.

        seleccionItemFactura();

        // calculoTotal();
    }


    //********************************************************************************
    public static void seleccionItemFactura() {

        PrintListasConsola.imprimirEncabezado(); // si saco este y lo coloco en otro method, imprime pero no lo veo.

        Item itemfactura = new Item();
        itemfactura.cargaItemInventario(); // Neiro xq tengo q volver a cargar aqui si ya lo hice.

        RelItemDescuento itemConDescuento = new RelItemDescuento(); // para validar si tiene descuento el item
        itemConDescuento.cargaListaItemDescuento();

        double xprecio = 0;
        double xmontodescuento = 0;
        double xprecioneto = 0;
        int xcoddes;
        String xdesdes = " ";
        String xcoditem = " ";
        int xrate = 0;
        double totalprecio = 0;
        boolean sihaydescto = false;

        // Ciclo por ITEMS.
        for (int y = 0; y < itemfactura.items.size(); y++) {
            Item mz3 = itemfactura.items.get(y);  // trae todos los datos de los items, pero no se usaran todos.

            String mz4 = itemfactura.items.get(y).getDatosItemFactura(); // traigo datos de items necesarios para la factura

            xprecio = itemfactura.items.get(y).getPrecioitem();
            xcoditem = itemfactura.items.get(y).getCoditem();  // el coditem para buscar si tiene descto

            // Iran a la factura solo los item que tengan más de 3 en su cantidad de disponibilidad en stop.
            int cantidaddispoitem = itemfactura.items.get(y).getCantdispo();


            if (cantidaddispoitem > 3) {

                // Verifico relación del item con algún descuento en RELID ArrayList.

                for (int z1 = 0; z1 < itemConDescuento.relID.size(); z1++) {

                    if (xcoditem == itemConDescuento.relID.get(z1).getCoditem()) {

                        xcoddes = itemConDescuento.relID.get(z1).getCoddes();


                        Descuento obj = buscaDescripcionDescuento(xcoddes);
                        xrate = obj.getRate();
                        xdesdes = obj.getDesdes();


                        sihaydescto = true;
                        break;

                    } else {
                        sihaydescto = false;
                    }

                }  // Fin del for relación item con algún descuento.

                //fatta validar el otro boulen
                if (sihaydescto) {
                    xmontodescuento = ((xprecio * xrate) / 100);
                    xprecioneto = xprecio - xmontodescuento;

                    totalprecio = totalprecio + xprecio - xmontodescuento;
                    System.out.println(mz4 + "        " + xmontodescuento + "       " + xdesdes + "       " + xprecioneto);

                } else {
                    totalprecio = totalprecio + xprecio;
                    System.out.println(mz4 + " sin descuento.");  // si no tiene descuento imprime.
                }

            }  // Fin del IF si supera la existencia en el intario va al baile, si no ney.

        }  //  Fin del for de item validando que sean los que tengan de 3 piezas en adelante en existencia.

        System.out.println("\n" + "ITEMS DISPONIBLES CON MÁS DE 3 PIEZAS - DESDE PROCESAR FACTURA");
        System.out.println("\n");
        System.out.println("_____________________________________________________________");
        System.out.println("TOTAL FACTURA  ----------------> " + xprecio);

        //  calculoTotalNeto();


    }  // Fin  de seleccionItemFactura


//********************************************************************************

    public static Descuento buscaDescripcionDescuento(int xcoddes) {

        Descuento descuentoRefObj = new Descuento();
        descuentoRefObj.cargaListaDescuento();
        boolean sihaydescuento = false;

        for (int yy = 0; yy < descuentoRefObj.descuentos.size(); yy++) {

            Descuento descuento = descuentoRefObj.descuentos.get(yy);


            if (descuento.getCoddes() == xcoddes) {
                return descuento;
            }
        }
        return null;

    }


}  //  Fin de NewProcesarFactura
