
package com.edu.lx;

import java.util.Scanner;

public class N011 {

   
    public static void main(String[] args) {
        
        //CONSTANTES
        
        //VARIABLES
        
        int n1,n2,m=0 ;        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        n1 = scan.nextInt();
        
        System.out.println("Ingrese numero 2: ");
        n2 = scan.nextInt();
        
        
        //PROCESO
        
        if (n1 > n2) {
            m = n1;
            
        }
        
        if (n2 > n1) {
            m = n2;
            
        }
 
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("El numero mayor es : " + m);
    }
    
}
