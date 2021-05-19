package org.example.neiro;

import com.example.model.Item;
import org.example.neiro.model.Factura;
import org.example.neiro.model.Inventario;
import org.example.neiro.v2.ProcesarFacturaV2;

import java.util.Arrays;

public class SistemaFacturacion {

    public static void main(String[] args) {

        System.out.println(String.format("%s", true));
//        firstApproach();
        secondApproach();

        //twoSum(new int[]{1,2,3,4,5,6}, 4);

    }
/*
    public static int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        int[] arr=new int[2];
        outer:  while(i!=nums.length-1)
        {   j=i+1;
            while(j<nums.length)
            {
                if(target-nums[i]==nums[j])
                {
                    arr[0]=i;
                    arr[1]=j;
                    break outer;
                }
                j++;
            }
            i++;
        }
        return arr;
    }*/


    private static void secondApproach() {
        Inventario inv = new Inventario();
        ProcesarPagos pp = new ProcesarPagos();
        ProcesarFacturaV2 p = new ProcesarFacturaV2(pp, inv);
        Factura factura = new Factura();

        Item a002 = inv.obtenerItemPorCodigo("A002");
        factura.agregarItem(a002, 3);
        p.procesar(factura, 40000);
    }

    private static void firstApproach() {
        Inventario inv = new Inventario();
        ProcesarFactura p = new ProcesarFactura();
        ProcesarPagos pp = new ProcesarPagos();
        Factura factura = new Factura();

        Item a002 = inv.obtenerItemPorCodigo("A002");
        factura.agregarItem(a002, 3);
        p.procesar(pp, inv, factura, 40000);
    }
}
