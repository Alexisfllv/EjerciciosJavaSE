
package com.edu.lx;

import java.util.Scanner;

public class N056 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        
        int n,s=0,i;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese numero : ");
        n  = scan.nextInt();
        
        //PROCESO
        for (i =1;i<=n;i++) {
            s = s+i;
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Suma : "+s);
    }
    
}
