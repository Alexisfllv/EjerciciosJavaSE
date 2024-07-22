
package com.edu.lx;

import java.util.Scanner;


public class N008 {

   
    public static void main(String[] args) {
        
        //VARIABLES
      
        float m,c,r,t,i;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Capital  : ");
        c = scan.nextFloat();
        
        System.out.println("Ingrese Interes : ");
        r = scan.nextFloat();
        
        System.out.println("Ingrese Tiempo : ");
        t = scan.nextFloat();
        
        //PROCESO
        m = (float) (Math.pow((double)(1+r/100),(double)t))*c;
        
        i = m-c;
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Monto : " +m);
        System.out.println("Interes : " + i);
    }
    
}
