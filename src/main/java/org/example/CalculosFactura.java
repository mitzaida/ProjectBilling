package org.example;

public class CalculosFactura {
    private int xPrecio;
    private int xRate;
    private double totalPrecioBruto;
    private double totalDescuento;
    private double totalPrecioNeto;

    public CalculosFactura() {}

    public CalculosFactura (int xPrecio, int xRate, double totalPrecioBruto, double totalDescuento, double totalPrecioNeto) {
        this.xPrecio = xPrecio;
        this.xRate = xRate;
        this.totalPrecioBruto = totalPrecioBruto;
        this.totalDescuento = totalDescuento;
        this.totalPrecioNeto = totalPrecioNeto;
    }

    public int getxPrecio() {
        return xPrecio;
    }

    public int getxRate() {
        return xRate;
    }

    public double getTotalPrecioBruto() {
        return totalPrecioBruto;
    }

    public double getTotalDescuento() {
        return totalDescuento;
    }

    public double getTotalPrecioNeto() {
        return totalPrecioNeto;
    }


    public static double subTotales () {

//        double pbruto = getTotalPrecioBruto();
//        double pdescto = getTotalDescuento();
//        double pbneto = getTotalPrecioNeto();


        //totalPrecioBruto=


        return 0;

    }

}
