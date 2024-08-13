
package com.edu.lx;

import java.util.Scanner;


public class N022 {

    
    public static void main(String[] args) {
        
        //CONSTANTES
        
        final float des_a = 0.20f;
        final float des_g = 0.15f;
        
        final float rec_a = 0.05f;
        final float rec_g = 0.10f;
        
        //VARIABLES
        
        float mc,m,tp;
        char tc,fp;
        String r;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Monto de Compra : ");
        mc = scan.nextFloat();
        System.out.println("Ingrese Tipo de Cliente : ");
        tc = scan.next().charAt(0);
        System.out.println("Ingrese Forma de Pago : ");
        fp = scan.next().charAt(0);
        
        
        
        //PROCESO
        
        if (tc == 'G') {
            if (fp == 'C') {
                
                m = mc * des_g;
                tp = mc - m;
                r = "DESCUENTO DE 15 %";
                
            }
            else{
                m = mc * des_a;
                tp = mc - m;
                r = "RECARGA DE 10 %";
                
            }
        }else{
            if (fp == 'C') {
                
                m = mc * des_a;
                tp = mc-m;
                r = "DESCUENTO DE 20%";
            }
            else{
                m = mc * rec_a;
                tp = mc - m;
                r = "RECARGA 10 %";
            }
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r + ": " +m);
        System.out.println("Total a pagar :" + tp);
        
    }
    
}
