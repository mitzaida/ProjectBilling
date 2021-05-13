package org.example;
import org.example.datalistas.*;


public class NewProcesarFactura {
//    static String descriDes = "";
//    static int porceDes = 0;

    static double totalPrecioBruto = 0;
    static double totalDescuento   = 0;
    static double totalPrecioNeto  = 0;

    static double mzObjeto1 = 0;
    static double mzObjeto2 = 0;
    static double mzObjeto3 = 0;
    //********************************************************************************
    public static void seleccionItemFactura() {

        // Imprime cabecera
//        PrintListasConsola.imprimirEncabezado(); // si saco este y lo coloco en otro method, imprime pero no lo veo.

        Item itemfactura = new Item();
        itemfactura.cargaItemInventario(); // Neiro xq tengo q volver a cargar aqui si ya lo hice.

        RelItemDescuento itemConDescuento = new RelItemDescuento(); // para validar si tiene descuento el item
        itemConDescuento.cargaListaItemDescuento();  //  E igual tengo q volver a cargar xq es otro objeto


        double xPrecio = 0;
        int xcoddes;
        String xcoditem = " ";
//        double totalPrecioBruto = 0;
//        double totalPrecioNeto = 0;
//        double totalDescuento = 0;
        boolean siHayDescto = false;

        String descriDes = "";
        int porceDes = 0;


        // Ciclo por ITEMS.
        for (int y = 0; y < itemfactura.items.size(); y++) {
            Item mz3 = itemfactura.items.get(y);  // trae todos los datos de los items, pero no se usaran todos.

            String datosItemFactura = itemfactura.items.get(y).getDatosItemFactura(); // traigo datos de items necesarios para la factura

            xPrecio = itemfactura.items.get(y).getPrecioitem();
            xcoditem = itemfactura.items.get(y).getCoditem();  // el coditem para buscar si tiene descto

            // Iran a la factura solo los item que tengan más de 3 en su cantidad de disponibilidad en stop.
            int cantidaddispoitem = itemfactura.items.get(y).getCantdispo();


            if (cantidaddispoitem > 3) {

                // Verifico relación del item con algún descuento en RELID ArrayList.
                for (int z1 = 0; z1 < itemConDescuento.relID.size(); z1++) {
                    if (xcoditem == itemConDescuento.relID.get(z1).getCoditem()) {
                        //xcoddes = itemConDescuento.relID.get(z1).getCoddes();
                        // Va a buscar con el valor de coddes encontrado y a compararlo y si cumple,
                        // devuelve en var objz toda la data del elemento del arralist leido en ese method, que
                        // son 4 variables de instancia que tiene la clase Descuento.
                        // objz recibirá el return del method.
                        Descuento objz = buscaDescripcionDescuento(itemConDescuento.relID.get(z1).getCoddes());
                        porceDes     = objz.getRate();
                        descriDes = objz.getDesdes();

                        siHayDescto = true;
                        break;

                    } else {

                       siHayDescto = false;

                    }

                }  // Fin del for relación item con algún descuento.


                // Verifico ya fuera del for con la bandera para imprimir descuento o no según dicha bandera.
                if (siHayDescto) {
                    System.out.println(datosItemFactura + "                 " + ((xPrecio*porceDes)/100) + "   " +
                                       descriDes + "       " + (xPrecio-((xPrecio*porceDes)/100)) );

                    mzObjeto1 = acumulaSubTotal1(xPrecio, porceDes);
                    mzObjeto2 = acumulaSubTotal2(xPrecio, porceDes);
                    mzObjeto3 = acumulaSubTotal3(xPrecio, porceDes);

                } else {

                    System.out.println(datosItemFactura + "                          Sin Descto    " +
                                           "                     " + xPrecio);  // Imprime q no tiene descuento.
                    mzObjeto1 = acumulaSubTotal1(xPrecio, porceDes);
                    mzObjeto3 = acumulaSubTotal3(xPrecio, porceDes);
                }


            }  // Fin del IF si supera la existencia en el intario va al baile, si no ney.

        }  //  Fin del for de item validando que sean los que tengan de 3 piezas en adelante en existencia.



        // Pie de la Factura
        PrintListasConsola.imprimirPieFactura();

        System.out.println("TOTAL FACTURA  ---------------    " + mzObjeto1 + "                 "+ mzObjeto2 +
         "                                    " + mzObjeto3);
        System.out.println();


    }  // Fin del M. seleccionItemFactura


//********************************************************************************
//  Method:  devuelve una var de tipo de la clase Descuento importada, recibiendo el
// el código de descuento from invoke method, wich i got from the relID ArrayList.
//********************************************************************************
    public static Descuento buscaDescripcionDescuento(int xcoddes) {

        Descuento descuentoRefObj = new Descuento();  //  Instance object de tipo Descuento
        descuentoRefObj.cargaListaDescuento();  // Carga la lista

        // Cycle control of List of descuentos en la clase Descuento.
        for (int yy = 0; yy < descuentoRefObj.descuentos.size(); yy++) {
            // Con la variable de ref instanciada la clase Descuento, accedo a la arraylist descuento.
            // Con la var de tipo Descuento, called descuento, obtengo en ella los valores del arraylist por posición.
            // No puedo tomar o extraer unos pocos valores que vienen del String completo.

            Descuento valorElementoArrayList = descuentoRefObj.descuentos.get(yy); // Get toda la data from descuentos ArrayList

            // De toda la data de acá, invoke method getCoddes y comparo. Si si retono toda la data.
            if (valorElementoArrayList.getCoddes() == xcoddes) {
                return valorElementoArrayList;
            }
        }
        return null;

    }  // Fin del method buscaDescripcionDescuento



    //********************************************************************************
    public static double acumulaSubTotal1(double xPrecio, int porceDes) {
        totalPrecioBruto += xPrecio;
        return totalPrecioBruto;
    }

    //********************************************************************************
    public static double acumulaSubTotal2(double xPrecio, int porceDes) {
        totalDescuento   += (xPrecio*porceDes)/100;
        return totalDescuento;
    }

    //********************************************************************************
    public static double acumulaSubTotal3(double xPrecio, int porceDes) {
        totalPrecioNeto += xPrecio - ((xPrecio*porceDes)/100);
        return totalPrecioNeto;
    }

}  //  Fin de NewProcesarFactura
