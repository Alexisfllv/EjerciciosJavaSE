
package com.edu.lx;

import java.util.Scanner;


public class N059 {

    
    public static void main(String[] args) {
       
        //VARIABLES
        int n,nr=0,i;
        String nr2="";
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese numero : ");
        n = scan.nextInt();
        //PROCESO
        
        for (i = 1; i <= n; i++) {
            
            
            if (i % 5==0) {
                nr = nr+1;
            }else if (n % 5 != 0) {
                nr2 = "pero no es multiplo de 5";
            }
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("num : " +nr + nr2);
    }
    
}
