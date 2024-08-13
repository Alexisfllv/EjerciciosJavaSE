
package com.edu.lx;

import java.util.Scanner;

public class N104 {

    public static void main(String[] args) {
        
        //VARIABLES
        int s;
        
        int a[][] = new int [2][2];
        int b[][] = new int [2][2];
        int c[][] = new int [2][2];
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("ARREGLO A : ");
        System.out.println("1 : ");
        a[0][0] = scan.nextInt();
        System.out.println("2 : ");
        a[0][1] = scan.nextInt();
        System.out.println("3 : ");
        a[1][0] = scan.nextInt();
        System.out.println("4 : ");
        a[1][1] = scan.nextInt();
        
        System.out.println("ARREGLO B : ");
        System.out.println("1 : ");
        b[0][0] = scan.nextInt();
        System.out.println("2 : ");
        b[0][1] = scan.nextInt();
        System.out.println("3 : ");
        b[1][0] = scan.nextInt();
        System.out.println("4 : ");
        b[1][1] = scan.nextInt();
        
        //PROCESO
        
        c = SumaDeArreglos(a,b);
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("[0][0] : "+c[0][0]);
        System.out.println("[0][1] : "+c[0][1]);
        System.out.println("[1][0] : "+c[1][0]);
        System.out.println("[1][1] : "+c[1][1]);
                
    }
    
    
    //metodo
    public static int[][] SumaDeArreglos(int X[][] , int Y[][])
    {
        //variables
        
        int i,j;
        
        //arreglos
        int s[][]  = new int [2][2];
        
        //proceso
        
        for (i = 0; i <=1; i++) {
            for (j = 0; j <=1; j++) {
                
                s[i][j]= X[i][j]+Y[i][j];
                
            }
        }
        
        
        //salida
        return s;
    }
}
