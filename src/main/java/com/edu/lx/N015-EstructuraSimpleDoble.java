
package com.edu.lx;

import java.util.Scanner;

public class N015 {

   
    public static void main(String[] args) {
        //CONSTANTES
        
        //VARIABLES
        float n ;
        String r ;
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero para saber si es par o no : ");
        n = scan.nextInt();
        
        
        //PROCESO
        if (n % 2 == 0) {
            r = "Es un numero par";
        }else{
            r = "Es un numero impar";
        }
        
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println(r);
    }
    
}
