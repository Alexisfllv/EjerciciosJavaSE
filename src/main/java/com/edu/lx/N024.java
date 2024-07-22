
package com.edu.lx;

import java.util.Scanner;

public class N024 {

    
    public static void main(String[] args) {
        
        
        //CONSTANTES
        
        //VARIABLE
        
        double a,b,c,d,x1,x2;
              
        //ENTRADA
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese a: ");
        a= scan.nextDouble();
        
        System.out.println("Ingrese b: ");
        b= scan.nextDouble();
        
        System.out.println("Ingrese c: ");
        c=scan.nextDouble();
        
        //PROCESO
        
        //D:
        
        d = Math.pow(b, 2.0) - 4.0 * a *c;
        
        if (a != 0 && d>= 0) {
            x1 = (-b + Math.pow(d, (1.0 / 2.0)))/ 2*a;
            x2 = (-b - Math.pow(d, (1.0 / 2.0)))/ 2*a;
            
        }else{
            x1 = 0;
            x2 = 0;
        }
        
        //SALIDA
        System.out.println("RESULTAD");
        System.out.println("X1 = : "+x1);
        System.out.println("X2 = : "+x2);
    }
    
}
