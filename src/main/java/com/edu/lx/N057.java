
package com.edu.lx;

import java.util.Scanner;


public class N057 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        int ne,ns,c=0,i;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese primer numero : ");
        ne = scan.nextInt();
        System.out.println("ingrese segundo numero : ");
        ns = scan.nextInt();
        
        
        
        //PROCESO
        
        
        
        for (i = ne+1; i < ns; i++) {
            c = c +1;
        }
        
        //SALIDA
        System.out.println("Resultado");
        System.out.println("num : " +c);
               
    }
    
}
