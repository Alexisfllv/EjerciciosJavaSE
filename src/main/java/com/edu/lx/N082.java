
package com.edu.lx;

import java.util.Scanner;


public class N082 {


    public static void main(String[] args) {
        //VARIABLE
        int i,j,s;
        //ARREGLO
        int n1[][] = new int[2][2];
        
        int n2[][] = new int[2][2];
        
        int n3[][] = new int[2][2];
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Matriz A ");
        System.out.println("0:0 : ");
        n1[0][0] = scan.nextInt();
        System.out.println("1:0 : ");
        n1[1][0] = scan.nextInt();
        System.out.println("0:1 : ");
        n1[0][1] = scan.nextInt();
        System.out.println("1:1 : ");
        n1[1][1] = scan.nextInt();
        System.out.println("Matriz B ");
        System.out.println("0:0 : ");
        n2[0][0] = scan.nextInt();
        System.out.println("1:0 : ");
        n2[1][0] = scan.nextInt();
        System.out.println("0:1 : ");
        n2[0][1] = scan.nextInt();
        System.out.println("1:1 : ");
        n2[1][1] = scan.nextInt();
        
        
        //PROCESO
        
        for (i = 0; i <= 1; i++) {
            for (j = 0; j <= 1; j++) {
                n3[i][j] = n1[i][j]+n2[i][j];
            }
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Arreglo C: ");
        System.out.println("0:0 : "+n3[0][0] );
        System.out.println("1:0 : "+n3[1][0] );
        System.out.println("0:1 : "+n3[0][1] );
        System.out.println("1:1 : "+n3[1][1] );
        
        
                
    }
    
}
