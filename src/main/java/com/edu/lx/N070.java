
package com.edu.lx;

import java.util.Scanner;


public class N070 {

    
    public static void main(String[] args) {
        //VARIABLES
        
        int n,d,i,r=0;
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        n = scan.nextInt();
        
        System.out.println("Ingrese divisor: ");
        d = scan.nextInt();
        
        
        //PROCESO
        
        for ( i = n-1; i >=1; i=i-1) {
            if (i % d ==0) {
                r = i;
                break;
            }
        }
        
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Respuesta " + r);
    }
    
}
