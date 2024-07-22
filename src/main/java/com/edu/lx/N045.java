
package com.edu.lx;

import java.util.Scanner;

public class N045 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        int n,c=0;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n = scan.nextInt();
        //PROCESO
        while (n>0) {            
            n = n/10;
            c = c+1;
        }
                
                
        //SALIDA
        System.out.println("RESULTADO ");
        System.out.println("cantidad : " + c);
    }
    
}
