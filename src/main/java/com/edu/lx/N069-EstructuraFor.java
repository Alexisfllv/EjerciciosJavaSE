
package com.edu.lx;

import java.util.Scanner;

public class N069 {

    
    public static void main(String[] args) {
        
        
        //VARIABLES
        int  n,c=0,i,j;
        Boolean q=true;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n = scan.nextInt();
        
        //PROCESO
        
        for (i = 2; i <=n; i++) {
            q = true;
            for (j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    q = false;
                }
            }
            if (q) {
                c = c+1;
                q = true;
            }
        }
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Cantidad " + c);
    }
    
}
