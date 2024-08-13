
package com.edu.lx;

import java.util.Scanner;


public class N072 {

    public static void main(String[] args) {
        //VARIABLES
        int i=0,nm=0;
        //ARREGLO
         int n[] = new int[5];
         
         int[] ne ;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese num 1 : ");
        n[0] = scan.nextInt();
        
        System.out.println("Ingrese num 2 : ");
        n[1] = scan.nextInt();
        
        System.out.println("Ingrese num 3 : ");
        n[2] = scan.nextInt();
        
        System.out.println("Ingrese num 4 : ");
        n[3] = scan.nextInt();
        
        System.out.println("Ingrese num 5 : ");
        n[4] = scan.nextInt();
        
        //PROCESO
        
        //nm = n[0];
        
        for (i = 0; i <= 4; i++) {
            //nm = n[i] = 0;
            
            
            if (n[i] > nm) {
                nm = n[i];
            }
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Numero mayor es : " +nm);
                
    }
    
}
