
package com.edu.lx;

import java.util.Scanner;

public class N002 {

    
    public static void main(String[] args) {
       
        //Variables
        int r,c,n1,n2;
        
        //Entrada
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el Dividendo : ");
        n1 = scan.nextInt();
        
        System.out.println("Ingrese el Divisor : ");
        n2 = scan.nextInt();
        
        
        //Proceso
        c = n1/n2;
        r = n1 % n2;
        
        //Salida
        
        System.out.println("RESULTADO");
        System.out.println("El Cociente es: "+ c);
        System.out.println("El Residuo es: "+ r);
        
    }
    
}
