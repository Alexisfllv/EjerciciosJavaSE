
package com.edu.lx;

import java.util.Scanner;

public class N067 {

    public static void main(String[] args) {
        
        //VARIABLES
        int n,f=1,i;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        n = scan.nextInt();
        
        //PROCESO
        for (i = 1;  i<= n; i++) {
            f = f * i;
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Factorial : " + f);
    }
    
}
