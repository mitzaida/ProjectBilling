package org.example;

import org.example.datalistas.*;

public class LastProcesarFactura {

    //********************************************************************************
    public static void selecItemFactura() {
        Item itemFactura = new Item();
        RelItemDescuento itemConDescuento = new RelItemDescuento(); // para validar si tiene descuento el item

        inicializarDatos(itemFactura, itemConDescuento);

        // Imprime cabecera
        PrintListasConsola.imprimirEncabezado("","","");
        // asi o coloca el m. static y no instancio.
        LastProcesarFactura algo = new LastProcesarFactura();
        algo.leerCicloItems(itemFactura, itemConDescuento);
    }  // Fin del M. selecItemFactura

    private static void mostrarDetallesFactura(double totalPrecioBruto,
                                               double totalDescuento,
                                               double totalPrecioNeto) {
        // Pie de la Factura
        PrintListasConsola.imprimirPieFactura();
        System.out.println("TOTAL FACTURA  ---------------    " + totalPrecioBruto + "                 " + totalDescuento +
                "                                    " + totalPrecioNeto);
    }


    //********************************************************************************
    public static void inicializarDatos(Item itemFactura, RelItemDescuento itemConDescuento) {
        itemFactura.cargaItemInventario(); // Neiro xq tengo q volver a cargar aqui si ya lo hice.
        itemConDescuento.cargaListaItemDescuento();  //  E igual tengo q volver a cargar xq es otro objeto
    }

    // Recorre Ciclo para los ITEMS de la factura.
    //********************************************************************************
    public void leerCicloItems(Item itemFactura, RelItemDescuento itemConDescuento) {
        double totalPrecioBruto = 0;
        double totalDescuento = 0;
        double totalPrecioNeto = 0;

        for (int y = 0; y < itemFactura.items.size(); y++) {
            Item mz3 = itemFactura.items.get(y);  // trae todos los datos de los items, pero no se usaran todos.

            //String datosItemFactura = mz3.getDatosItemFactura(); // traigo datos de items necesarios para la factura
            String datosItemFactura = mz3.getDatosItemFactura(); // traigo datos de items necesarios para la factura

            double Precio = mz3.getPrecioitem();
            String xcoditem = mz3.getCoditem();  // el coditem para buscar si tiene descto

            // Iran a la factura solo los item que tengan más de 3 en su cantidad de disponibilidad en stop.
            int cantidadDispoItem = mz3.getCantdispo();

            if (cantidadDispoItem < 3) {
                continue;
            }

            Descuento objetoDescuento = buscarDescuento(xcoditem, itemConDescuento);

            double valorDescuento = 0;
            double valorNeto = Precio;

            if (objetoDescuento != null) {
                String descriDes = objetoDescuento.getDesdes();
                int porceDes = objetoDescuento.getRate();
                valorDescuento = (Precio*porceDes)/100 ;
                valorNeto = Precio - valorDescuento;
                System.out.println(datosItemFactura + "                 " + valorDescuento + "   " +
                        descriDes + "       " + valorNeto);

            } else {
                System.out.println(datosItemFactura + "                          Sin Descto    " +
                        "                     " + Precio);  // Imprime q no tiene descuento.
            }
            totalPrecioBruto += Precio;
            totalDescuento += valorDescuento;
            totalPrecioNeto += valorNeto;

        }  // Fin del for principal de Items.

        mostrarDetallesFactura(totalPrecioBruto, totalDescuento, totalPrecioNeto);

    }  // Fin del M. leerCicloItems


    public Descuento buscarDescuento(String xcoditem, RelItemDescuento itemConDescuento) {
        // Verifico relación del item con algún descuento en RELID ArrayList.
        for (int z1 = 0; z1 < itemConDescuento.relID.size(); z1++) {
            if (xcoditem == itemConDescuento.relID.get(z1).getCoditem()) {
                Descuento datosDescuento = buscaDescripcionDescuento(itemConDescuento.relID.get(z1).getCoddes());
                if (datosDescuento != null) {
                    return datosDescuento;
                }
            }
        }  // Fin del for relación item con algún descuento.
        return null;
    }

    //********************************************************************************
    //  Method:  devuelve una var de tipo de la clase Descuento importada, recibiendo el
    // el código de descuento from invoke method, wich i got from the relID ArrayList.
    //********************************************************************************
    public Descuento buscaDescripcionDescuento(int xcoddes) {
        //Descuento enviarValor ;
        Descuento enviarValor = null;
        Descuento descuentoRefObj = new Descuento();  //  Instance object de tipo Descuento

        descuentoRefObj.cargaListaDescuento();  // Carga la lista de los descuentos.

        // Cycle control of List of descuentos en la clase Descuento.
        for (int yy = 0; yy < descuentoRefObj.descuentos.size(); yy++) {
            Descuento valorElementoArrayList = descuentoRefObj.descuentos.get(yy); // Get toda la data from descuentos ArrayList

            // De toda la data de acá, invoke method getCoddes y comparo. Si si retono toda la data.
            if (valorElementoArrayList.getCoddes() == xcoddes) {
                enviarValor = valorElementoArrayList;
                break;
            }
        }

        return enviarValor;
    }  // Fin del method buscaDescripcionDescuento

}  //  Fin de LastProcesarFactura

