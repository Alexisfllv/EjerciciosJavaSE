
package com.edu.lx;

import java.util.Scanner;

public class N047 {

    public static void main(String[] args) {
        
        //VARIABLES
        int n,nr,m=0,i,d;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n = scan.nextInt();
        
        //PROCESO
        
        while (n >0) {            
            d = n%10;
            if (d > m ) {
                m = d;
            }
            n = n/10;
                    
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Numero mayor : " + m);
       
    }
    
}
