
package com.edu.lx;

import java.util.Scanner;

public class N064 {

    
    public static void main(String[] args) {
        
        
        //VARIABLES
        float  n ,r=0,i;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese numero : ");
        n = scan.nextFloat();
        //PROCESO
        
        for (i = 1;  i<= n-1; i++) {
            r = r +(i / (i+1));
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("numero " +r );
    }
    
}
