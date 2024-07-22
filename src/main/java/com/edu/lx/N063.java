
package com.edu.lx;

import java.util.Scanner;

public class N063 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        int  n1,n2,i,n11=0,n22=0;
        String r;
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese numero 1 : ");
        n1 = scan.nextInt();
        
        System.out.println("ingrese numero 2 : ");
        n2 = scan.nextInt();
        //PROCESO
        
        for (i = 1; i < n1; i++) {
            if (n1 % i ==0 ) {
                n11 = n11 + i;
            }
        }
        
        for (i = 1; i < n2; i++) {
            if (n2 % i == 0) {
                n22 = n22 +i;
            }
            
        }
        
        if (n1 == n22) {
            r = "Son numeros amigos " ;
        }else{
            r = "No son numeros amigos";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r);
    }
    
}
