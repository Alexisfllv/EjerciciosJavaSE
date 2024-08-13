
package com.edu.lx;

import java.util.Scanner;

public class N004 {

    public static void main(String[] args) {
        
        //Variables
        
        short a,n;
        int p;
        
        //Entrada
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("valor de a : ");
        a = scan.nextShort();
       
        System.out.println("valor de n : ");
        n = scan.nextShort();
        
        
        
        
        //Proceso 
        
        p =  (int)Math.pow((double)a,(double)n);
        
        //Salida
        System.out.println("RESULTADO");
        System.out.println("Potencia : " + p);
    }
    
}
