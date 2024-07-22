
package com.edu.lx;

import java.util.Scanner;

public class N050 {

    
    public static void main(String[] args) {
        
        
        //VARIABLES
        int t,d,s=0,n;
        String r="";
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n = scan.nextInt();
        //PROCESO
        t = n;
        
        while (t >0) {
            d = t %10;
            t = t /10;
            s = (int) (s + Math.pow((double)d, 3.0));
            
        }
        
        if (n == s) {
            r = "CUBO PERFECTO";
            
        }else{
            r = "NO ES CUBO PERFETO";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r);
    }
    
}
