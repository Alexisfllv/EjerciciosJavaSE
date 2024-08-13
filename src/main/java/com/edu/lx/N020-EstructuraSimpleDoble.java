
package com.edu.lx;

import java.util.Scanner;


public class N020 {

    
    public static void main(String[] args) {
     
        
        //CONSTANTES
        
        final float c1 = 0.1f;
        final float c2 = 0.2f;
        final float c3 = 0.3f;
        final float igvv = 0.19f;
        
        
        
        //VARIABLES
        float c,des,imp,t;
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese precio : ");
        c = scan.nextFloat();
        
        
        
        //PROCESO
        
        if (c > 200) {
            des = c * c3;
            
        }else if  (c > 100) {
            des = c*c2;
            
        }else{
            des = c*c1;
        }
        
        
        imp = (c - des)*igvv;
        
        t = (c -des + imp);
        
        
        
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("Descuento : " + des);
        System.out.println("Impuesto igv : " + imp);
        System.out.println("Total a pagar  : " + t);
        
    }
    
}
