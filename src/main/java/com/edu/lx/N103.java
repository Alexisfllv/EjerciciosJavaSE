
package com.edu.lx;

import java.util.Scanner;


public class N103 {


    public static void main(String[] args) {
        
        //VARIABLES
        int nm=0;
        int i,j;
        
        int a[][] = new int[3][2];
                
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Arreglo A : ");
        System.out.println("[0][0] : ");
        a[0][0] = scan.nextInt();
        System.out.println("[0][1] : ");
        a[0][1] = scan.nextInt();
        System.out.println("[1][0] : ");
        a[1][0] = scan.nextInt();
        System.out.println("[1][1] : ");
        a[1][1] = scan.nextInt();
        System.out.println("[2][0] : ");
        a[2][0] = scan.nextInt();
        System.out.println("[2][1] : ");
        a[2][1] = scan.nextInt();
                
        
        //PROCESO
        
        nm = NumeroMayorArreglo(a);
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("num mayor : " + nm);
                
    }
    
    public static int NumeroMayorArreglo(int X[][])
    {
        //variables
        int nm=0;
        int i=0,j=0;
        int aux;
        
        
        int a[][] = X;
        //proceso
        
        nm = X[0][0];
        
        for (i = 0; i <=2; i++) {
            for (j = 0; j <=1; j++) {
                
                if (X[i][j] > nm) {
                    nm = X[i][j];
                }
            }
        }
        
        
        //salida
        return nm;
    }
    
}
