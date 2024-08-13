
package com.edu.lx;

import java.util.Scanner;


public class N062 {

    
    public static void main(String[] args) {
        //VARIABLES
        int n,i,v=0;
        String r;
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese numero : ");
        n = scan.nextInt();
        
        //PROCESO
        for (i  = 1;  i< n; i++) {
            if (n % i == 0) {
                v = v+i;
            }
        }
        if (v == n) {
            r = "Es numero perfecto";
        }else{
            r = "No es un numero perfecto";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r);
    }
    
}
