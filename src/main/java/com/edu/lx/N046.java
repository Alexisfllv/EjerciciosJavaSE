
package com.edu.lx;

import java.util.Scanner;

public class N046 {

   
    public static void main(String[] args) {
        
        //VARIABLES
        int d=0,n,c=0;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n=scan.nextInt();
        //PROCESO
        while (n >0) {            
            d= n %10;
            if (d %2==0) {
                c = c+1;           
            }
            n = n/10;
        }
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("num : " + c);
    }
    
}
