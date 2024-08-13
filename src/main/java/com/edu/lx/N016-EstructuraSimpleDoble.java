
package com.edu.lx;

import java.util.Scanner;


public class N016 {

   
    public static void main(String[] args) {
       
        //CONSTANTES
        
        //VARIABLES
        float n1,n2,n3,m=0 ;
        
        
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero 1 : ");
        n1 = scan.nextFloat();
        System.out.println("Ingrese numero 2 : ");
        n2 = scan.nextFloat();
        System.out.println("Ingrese numero 3 : ");
        n3 = scan.nextFloat();
        //PROCESO
        
        if (n1 > n2) {
            m = n1;
            
        }if (n3 > m) {
            m = n3;
            
        }if (n2 > m) {
            
            m = n2;
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("El numero mayor es " +m);
    }
    
}
