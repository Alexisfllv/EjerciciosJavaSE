
package com.edu.lx;

import java.util.Scanner;

public class N083 {

    public static void main(String[] args) {
        
        //VARIABLES
        int nm =0,i,j;
        //ARREGLOS
        int n[][] = new int[3][2];
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Matriz n : ");
        System.out.println("0:0 : ");
        n[0][0] = scan.nextInt();
        System.out.println("0:0 : ");
        n[1][0] = scan.nextInt();
        System.out.println("0:0 : ");
        n[2][0] = scan.nextInt();
        System.out.println("0:0 : ");
        n[0][1] = scan.nextInt();
        System.out.println("0:0 : ");
        n[1][0] = scan.nextInt();
        System.out.println("0:0 : ");
        n[2][1] = scan.nextInt();
        
        
        //PROCESO
        
        nm = n[0][0];
        for (i = 0; i <=2; i++) {
            for (j = 0; j <=1; j++) {
                
                if (n[i][j] > nm) {
                    nm = n[i][j];
                }
                
            }
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Numero mayor : " +nm);
    }
    
}
