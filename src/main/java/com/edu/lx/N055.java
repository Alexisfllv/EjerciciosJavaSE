
package com.edu.lx;

import java.util.Scanner;


public class N055 {

    
    public static void main(String[] args) {
        
        
        //VARIABLES
        int n,nr=0,b,i=0,d;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero base 10 : ");
        n = scan.nextInt();
        
        System.out.println("Ingrese base a : ");
        b = scan.nextInt();
        
        //PROCESO
        
        while (n > 0) {            
            d = n % b;
            n = n/b;
            i = i * 10 +d;
        }
        while (i >0) {            
            d = i % 10;
            i = i / 10;
            nr = nr  * 10 +d;
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("numero base "+ b + " num : " +nr);
        
    }
    
}
