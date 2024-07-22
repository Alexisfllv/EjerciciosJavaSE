
package com.edu.lx;

import java.util.Scanner;


public class N058 {

    
    public static void main(String[] args) {
        //VARIABLES
        int ne,ns,nr=0,i;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero : ");
        ne = scan.nextInt();
        
        System.out.println("Ingrese segundo numero : ");
        ns = scan.nextInt();
        
        //PROCESO
        
        for (i = ne+1; i <ns; i++) {
            if (i %2 == 0) {
                nr = nr +1;
            }
            
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Num : " + nr);
    }
    
}
