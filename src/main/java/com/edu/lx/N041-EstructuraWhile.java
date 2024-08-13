
package com.edu.lx;

import java.util.Scanner;


public class N041 {

    
    public static void main(String[] args) {
        
        
        //VARIABLES
         
        int i,n,s =0;
        
        //ENTRADA
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n = scan.nextInt();
        
        //PROCESO
        i= 1;
        
        while (i<= n) {            
            
            s= s+i;
            i=i+1;
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Suma de numeros es : " +s);
    }
    
}
