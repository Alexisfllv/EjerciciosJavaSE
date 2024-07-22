
package com.edu.lx;

import java.util.Scanner;


public class N049 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        
        int d,n,i=0;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n = scan.nextInt();
        
        
        //PROCESO
        while (n >0) {            
            d= n % 10;
            n = n /10;
            i = i*10+d;
        }
        
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("Numero inverso : " + i);
    }
    
}
