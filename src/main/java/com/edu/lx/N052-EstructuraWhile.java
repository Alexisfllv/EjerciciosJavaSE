
package com.edu.lx;

import java.util.Scanner;


public class N052 {

    
    public static void main(String[] args) {
        //VARIABLES
        int n,i=0,d,t;
        String r ="";
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n = scan.nextInt();
        //PROCESO
        t = n;
        while (t > 0) {            
            d = t %10;
            t = t /10;
            i = i *10 +d;
        }
        if (n ==i) {
            r = "CAPICUA";
            
        }else{
            r = "NO ES CAPICUA";
        }
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r);
    }
    
}
