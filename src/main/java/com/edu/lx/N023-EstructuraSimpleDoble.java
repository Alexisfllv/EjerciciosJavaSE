
package com.edu.lx;

import java.util.Scanner;


public class N023 {

    
    public static void main(String[] args) {

        //CONSTANTES
        
        //VARIABLES
        float a,b,x;
        
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese valor de A : "); 
        a = scan.nextFloat();
        System.out.println("Ingrese valor de B : ");
        b = scan.nextFloat();
        
        
        
        
        
        //PROCESO
        if (a != 0) {
            x = -b /a;
            
        }else{
            x = 0;
        }
        //SALIDA 
        System.out.println("RESULTADO");
        System.out.println("Valor de X es : "+x);

    }
    
}
