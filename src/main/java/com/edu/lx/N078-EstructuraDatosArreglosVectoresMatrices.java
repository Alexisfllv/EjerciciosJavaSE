
package com.edu.lx;

import java.util.Scanner;

public class N078 {


    public static void main(String[] args) {
        
        
        //VARIABLES
        int s=0,i,j;
        
        
        //ARREGLOS
        int n[][] = new int[3][2];
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese num 1 : ");
        n[0][0] = scan.nextInt();
        
        System.out.println("Ingrese num 2 : ");
        n[0][1] = scan.nextInt();

        System.out.println("Ingrese num 3 : ");
        n[1][0] = scan.nextInt();
        
        System.out.println("ingrese num 4 : ");
        n[1][1] = scan.nextInt();
        
        System.out.println("Ingrese num 5 : ");
        n[2][0] = scan.nextInt();
        
        System.out.println("Ingrese num 6 : ");
        n[2][1] = scan.nextInt();
        
        //PROCESO
        
        for ( i = 0; i <= 2; i++) {
            
            for (j = 0; j <= 1; j++) {
                
                s = s +n[i][j];
            }
        }
        
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("Suma  : " + s);
    }
    
}
