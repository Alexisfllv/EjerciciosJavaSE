
package com.edu.lx;

import java.util.Scanner;

public class N079 {

   
    public static void main(String[] args) {
        
        
        //VARIABLES
        
        int s1=0,s2=0,s3=0,i,j;
        
        
        //ARREGLO
        int n[][] = new int [4][3];
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese cuadro S1");
        System.out.println("0:0 : ");
        n[0][0] = scan.nextInt();
        
        System.out.println("1:0 : ");
        n[1][0] = scan.nextInt();
        
        System.out.println("2:0 : ");
        n[2][0] = scan.nextInt();
        
        System.out.println("3:0 : ");
        n[3][0] = scan.nextInt();
        
        System.out.println("Ingrese cuadro S2");
        
        System.out.println("0:1 : ");
        n[0][1] = scan.nextInt();
        
        System.out.println("1:1 : ");
        n[1][1] = scan.nextInt();
        
        System.out.println("2:1 : ");
        n[2][1] = scan.nextInt();
        
        System.out.println("3:1 : ");
        n[3][1] = scan.nextInt();
        
        System.out.println("Ingrese cuadro S3");
        System.out.println("0:2 : ");
        n[0][2] = scan.nextInt();
        
        System.out.println("1:2 : ");
        n[1][2] = scan.nextInt();
        
        System.out.println("2:2 : ");
        n[2][2] = scan.nextInt();
        
        System.out.println("3:2 : ");
        n[3][2] = scan.nextInt();
        
        
        
        //PROCESO
        for (i = 0; i <= 3; i++) {
            
            s1 = s1 + n[i][0];
            
            s2 = s2 + n[i][1];
            
            s3 = s3 + n[i][2];
        }
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Suma 1 : " + s1);
        System.out.println("Suma 2 : " + s2);
        System.out.println("Suma 3 : " + s3);
                
    }
    
}
