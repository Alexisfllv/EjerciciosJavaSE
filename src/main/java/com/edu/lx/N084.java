
package com.edu.lx;

import java.util.Scanner;


public class N084 {


    public static void main(String[] args) {
        
        
        //VARIABLES
        int i,j,ob,LI,LS;
        //ARREGLOS
        int n[][] = new int[3][2];
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Matriz n : ");
        System.out.println("0:0 : ");
        n[0][0] = scan.nextInt();
        System.out.println("0:0 : ");
        n[0][1] = scan.nextInt();
        System.out.println("0:0 : ");
        n[1][0] = scan.nextInt();
        System.out.println("0:0 : ");
        n[1][1] = scan.nextInt();
        System.out.println("0:0 : ");
        n[2][0] = scan.nextInt();
        System.out.println("0:0 : ");
        n[2][1] = scan.nextInt();
        
        
        
        //PROCESO
        
        LS = 2;
        
        for (i = 0; i <= LS -1; i++) {
            for (j = 0; j <= LS -1; j++) {
                
                if (n[j][0] > n[j+1][0]) {
                    ob = n[j][0];
                    n[j][0] = n[j+1][0];
                    n[j+1][0] = ob;
                }
                if (n[j][1] > n[j+1][1]) {
                    ob = n[j][1];
                    n[j][1] = n[j+1][1];
                    n[j+1][1] = ob;
                    
                }
            }
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("ORDENADO");
        System.out.println("Numero 1 : " +n[0][0]);
        System.out.println("Numero 2 : " +n[0][1]);
        System.out.println("Numero 3 : " +n[1][0]);
        System.out.println("Numero 4 : " +n[1][1]);
        System.out.println("Numero 5 : " +n[2][0]);
        System.out.println("Numero 6 : " +n[2][1]);
    }
    
}
