
package com.edu.lx;

import java.util.Scanner;


public class N012 {

    
    public static void main(String[] args) {
        
        //CONSTANTE
        
        //VARIABLE
        int n;
        String r= "";
        
        
        //ENTRADA
        Scanner scan  = new Scanner(System.in);
        System.out.println("ingrese numero : ");
        n = scan.nextInt();
        
        
        
        //PROCESO
        
        if (n > 0) {
            r = "Positivo";
        }
        
        if (n < 0) {
            r = "Negativo";
            
        }
        
        if (n == 0) {
            r = "Neutro";
            
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("El numero tiene valor : " +r);
    }
    
}
