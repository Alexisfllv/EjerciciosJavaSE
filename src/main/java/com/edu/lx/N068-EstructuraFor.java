
package com.edu.lx;

import java.util.Scanner;


public class N068 {


    public static void main(String[] args) {
        //VARIABLES
        int n,nr,i;
        String r="";
        boolean q=true;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese numero : ");
        n = scan.nextInt();
        //PROCESO
        
        for (i = 2;  i <=  n /2; i++) {
            if (n % i ==0) {
                q = false;
                break;
            }else{
                q = true;
            }
        }
        
        if (q) {
            r = "es numero primo ";
        }else{
            r = "no es numero primo ";
        }
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r);
                
    }
    
}
