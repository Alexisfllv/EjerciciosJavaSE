
package com.edu.lx;

import java.util.Scanner;

public class N017 {

    
    public static void main(String[] args) {
        
        //CONSTANTES
        
        //VARIABLES
        float n,m;
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n = scan.nextFloat();
        
        
        //PROCESO
        
        if (n % 2 == 0) {
            m = n *2;
        }else
        {
            m = n*3;
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Valor numero : " +m);
    }
    
}
