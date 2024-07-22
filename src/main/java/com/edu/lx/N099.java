
package com.edu.lx;

import java.util.Scanner;

public class N099 {


    public static void main(String[] args) {
        
        //VARIABLES
        int n, c=0;
        
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite numero : ");
         n= scan.nextInt();
            
        //PROCESO
        
        c = CantidadDigitos(n);
        
        //SALIDA
        System.out.println("RES");
        System.out.println("Digitos : " +c);
                
        
        
    }

    private static int CantidadDigitos(int cantidad) {
        
        //variables
        int c =0;
        
        
        //proceso
        
        while (cantidad >0) {            
            cantidad = cantidad/10;
            c = c +1;
        }
        //salida
        return c;
    }
    
    
    
}
