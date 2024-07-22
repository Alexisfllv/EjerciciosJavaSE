
package com.edu.lx.By;

import java.util.Scanner;


public class Array2 {


    public static void main(String[] args) {
        //VARIABLES
        
        int n=0,m=0;
        int i,j=0;
        
        
        //ARREGLOS
        
        int x[][] = new int[n][m];
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese valor de  n : ");
        n = scan.nextInt();
        System.out.println("ingrese valor de  m : ");
        m = scan.nextInt();
        
        //arreglos :
        
        
        //PROCESO
        for (i = 0; i <=n; i++) {
            for (j = 0; j <=m; j++) {
                x[i][j] =x[i][j] + 1;
            }
        }
        
        
        //SALIDA
        System.out.println("Val e : " +x[i][j]);
    }
    
}
