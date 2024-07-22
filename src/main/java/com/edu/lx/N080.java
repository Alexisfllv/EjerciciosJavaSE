
package com.edu.lx;

import java.util.Scanner;

public class N080 {


    public static void main(String[] args) {
        
        //VARIABLES
        int pr=0,ip=0,i,j;
        //ARREGLOS
        int n[][] = new int [3][2];
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("0:0 : ");
        n[0][0] = scan.nextInt();
        System.out.println("0:1 : ");
        n[0][1] = scan.nextInt();
        System.out.println("1:0 : ");
        n[1][0] = scan.nextInt();
        System.out.println("1:1 : ");
        n[1][1] = scan.nextInt();
        System.out.println("2:0 : ");
        n[2][0] = scan.nextInt();
        System.out.println("2:1 : ");
        n[2][1] = scan.nextInt();
        
        
        
           
        //PROCESO
        
        //3x
        for (i = 0; i <=2; i++) {
            
            for (j = 0; j <=1; j++) {
                
                if (n[i][j] % 2 ==0) {
                    pr = pr +1;
                }else
                {
                    ip = ip + 1;
                }
            }
        }
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("pares : " + pr);
        System.out.println("inpares : " + ip);
                
    }
    
}
