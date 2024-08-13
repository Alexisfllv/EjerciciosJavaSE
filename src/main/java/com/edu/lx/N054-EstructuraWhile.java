
package com.edu.lx;

import java.util.Scanner;


public class N054 {

    
    public static void main(String[] args) {
        
        
        //VARIABLES
        int n,b,d;
        boolean flag;
        String r = "";
        //ENTRADAS
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        n = scan.nextInt();
        
        System.out.println("Ingrese base : ");
        b = scan.nextInt();
        
        //PROCESO
        
        flag = true;
        
        while (n > 0 ) {            
            d = n %10;
            n = n / 10;
            if (d >= b) {
                flag = false;
                break;
            }
        }
        if (flag) {
            r = "BASE CORRECTA";
        }else{
            r = "BASE INCORRECTA";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r);
        
    }
    
}
