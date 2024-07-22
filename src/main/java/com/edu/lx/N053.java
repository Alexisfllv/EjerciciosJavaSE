
package com.edu.lx;

import java.util.Scanner;


public class N053 {

    public static void main(String[] args) {
        
        //VARIABLES
        int n,i =0;
        String r;
        boolean flag;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar numero : ");
        n= scan.nextInt();
        
        
        //PROCESO
        flag = true;
        i =2;
        while (i <= n /2) {           //8/2 = 4   // 2<=4
            
            if (n % i ==0) {            //8 % 2
                flag = false;
                break;
            }
            i++;
        }
        if (flag) {
            r = "Es primo ";
            
        }else{
            r = "No es primo";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r);
    }
    
}
