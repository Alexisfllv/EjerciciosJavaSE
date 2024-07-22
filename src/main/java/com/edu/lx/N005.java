
package com.edu.lx;

import java.util.Scanner;

public class N005 {

    public static void main(String[] args) {
        
        
        //Variables
        int a , n,r;
        
        //Entrada
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor de a: ");
        a = scan.nextInt();
        
        System.out.println("Valor de n: ");
        n = scan.nextInt();
        
        //Proceso
        
        r = (int)Math.pow((double)a,(1/(double)n));
        
        //Salida
        System.out.println("RESULTADO");
        System.out.println("Potencia : " + r);
    }
    
}
