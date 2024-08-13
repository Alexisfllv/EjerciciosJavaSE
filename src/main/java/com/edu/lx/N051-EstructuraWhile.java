
package com.edu.lx;

import java.util.Scanner;


public class N051 {

    
    public static void main(String[] args) {
        
        
        //VARIABLES
        int n,d,c = 0,r;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Numerador : ");
        n = scan.nextInt();
        
        System.out.println("Denominador : ");
        d = scan.nextInt();
        
        //PROCESO
        while (n >= d) {            
            n = n-d;
            c= c+1;
        }
        
        r =n;
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("cociente : "+c);
        System.out.println("residuo : "+r);
    }
    
}
