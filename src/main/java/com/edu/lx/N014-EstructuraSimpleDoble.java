
package com.edu.lx;

import java.util.Scanner;


public class N014 {

    
    public static void main(String[] args) {
        
        
        //CONSTANTES
        
        //VARIABLES
        
        int n;
        String r;
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero para analizar");
        n = scan.nextInt();
        
        
        
        //PROCESO
        
        if (n % 3 == 0 && n %5 == 0) {
            r = "Si es multiplo de 3  y 5";
            
        }else
        {
            r = "No es multiplo de 3 y 5";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r);
    }
    
}
