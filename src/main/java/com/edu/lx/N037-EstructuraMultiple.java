
package com.edu.lx;

import java.util.Scanner;


public class N037 {

   
    public static void main(String[] args) {
        
        
        //VARIABLES
        int d1= 0,d2=0,d3=0;
        String res;
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese d1 : ");
        d1 = scan.nextInt();
        System.out.println("Ingrese d2 : ");
        d2 = scan.nextInt();
        System.out.println("Ingrese d3 : ");
        d3 = scan.nextInt();
        
        
        //PROCESO
        
        if (d1==6 && d2==6 && d3 == 6) {
            res = "ORO";
        }else if (d1==6 && d2 == 6 || d1==6 && d3 == 6 || d2==6 && d3 == 6) {
            res = "PLATA";
        }else if (d1 ==6 || d2 == 6 || d3 ==6) {
            res = "BRONCE";
        }else{
            res = "SIN VALOR";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Valor : " + res);
    }
    
}
