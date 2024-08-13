
package com.edu.lx;

import java.util.Scanner;

public class N019 {

    public static void main(String[] args) {
        
        //CONSTANTES
        final float c1 = 0.1f;
        final float c2 = 0.2f;
        final float igv = 0.19f;
        
        
        //VARIABLES
        float n,des =0,imp = 0,total = 0;
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese precio : ");
        n = scan.nextFloat();
        //PROCESO
        
        if (n >= 100) {
            des = n * c2;
            imp = (n -des)*igv;
            n = n-des;
            total = n + imp;
            
        }
        if (n <=100) {
            des = n *c1;
            imp = (n-des)*igv;
            n = n-des;
            total = n + imp;
            
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("DESCUENTO : " +des);
        System.out.println("IMPORTE : " + imp);
        System.out.println("TOTAL : " +total);
        
    }
    
}
