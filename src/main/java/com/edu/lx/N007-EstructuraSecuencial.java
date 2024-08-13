
package com.edu.lx;

import java.util.Scanner;

public class N007 {

   
    public static void main(String[] args) {
        
        //VARIABLES
        int n,s;
        //ENTRADA
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese  numero : ");
        n = scan.nextInt();
        
   
        
        
        //PROCESO
        
        s = (n*(n +1) )/2;
        //SALIDA
                
        System.out.println("RESULTADO");
        System.out.println("Suma : "+s );
                
    }
    
}
