
package com.edu.lx;

import java.util.Scanner;


public class N009 {

    public static void main(String[] args) {
       
        //CONSTANTES
        
        final float pi=3.14159f;
        
        //VARIABLES
        
        float r,a;
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese valor del radio : ");
        r = scan.nextFloat();
        
        
        
        //PROCESO
        
        a = (float) (pi * (Math.pow((double)r,2.0)));
        
        //SALIDA
        
        System.out.println("RESULTADO ");
        System.out.println("El Area es : "+a);
        
        
    }
    
}
