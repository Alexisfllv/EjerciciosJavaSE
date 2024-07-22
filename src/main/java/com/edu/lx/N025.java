
package com.edu.lx;

import java.util.Scanner;


public class N025 {

    
    public static void main(String[] args) {
        
        
        //CONSTANTES
        
        
        //VARIABLES
        
        int h,m,s;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese hora : ");
        h = scan.nextInt();
        
        System.out.println("Ingrese minuto : ");
        m = scan.nextInt();
        
        System.out.println("Ingrese segundo : ");
        s = scan.nextInt();
        
        
        
        
        //PROCESO
        
        s = s+1;
        
        if (s == 60) {
            s = 0;
            m = m+1;
        }if (m== 60) {
            s = 0;
            m = m+1;
            
        }if (h == 24) {
            h = 0;
        }
            
        
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("Hora: "+h);
        System.out.println("Minuto: "+m);
        System.out.println("Segundo: "+s);
    }
    
}
