
package com.edu.lx;

import java.util.Scanner;

public class N061 {

    public static void main(String[] args) {
        
        
        
        //VARIABLES
        int n,i,c=0;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n = scan.nextInt();
        
        //PROCESO
        
        for (i = 1; i <= n; i++) {
            c = c + (2 *i -1);
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("cuadrado numero : " + c);
    }
}
