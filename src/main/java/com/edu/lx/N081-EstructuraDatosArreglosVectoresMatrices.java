
package com.edu.lx;

import java.util.Scanner;

public class N081 {


    public static void main(String[] args) {
        
        //VARIABLES
        int nb=0,i,j,p1=0,p2=0;
        
        String r="";
        //ARRAYS
        int n[][] = new int[4][3];
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
       
        System.out.println("0:0 : ");
        n[0][0] = scan.nextInt();
        
        System.out.println("1:0 : ");
        n[1][0] = scan.nextInt();
        
        System.out.println("2:0 : ");
        n[2][0] = scan.nextInt();
        
        System.out.println("3:0 : ");
        n[3][0] = scan.nextInt();
           
        System.out.println("0:1 : ");
        n[0][1] = scan.nextInt();
        
        System.out.println("1:1 : ");
        n[1][1] = scan.nextInt();
        
        System.out.println("2:1 : ");
        n[2][1] = scan.nextInt();
        
        System.out.println("3:1 : ");
        n[3][1] = scan.nextInt();
        
        System.out.println("0:2 : ");
        n[0][2] = scan.nextInt();
        
        System.out.println("1:2 : ");
        n[1][2] = scan.nextInt();
        
        System.out.println("2:2 : ");
        n[2][2] = scan.nextInt();
        
        System.out.println("3:2 : ");
        n[3][2] = scan.nextInt();
        
        
        System.out.println("Ingrese numero a buscar : " );
        nb = scan.nextInt();
        
        //PROCESO
        
        //4
        for (i = 0; i <= 3; i++) {
            //3
            for (j = 0; j <= 2; j++) {
                
                if (nb == n[i][j]) {
                    r = "Si existe";
                    p1 = i;
                    p2 = j;
                    
                    
                }else if (p1 ==0) {
                    r = "No existe";
                }
            }
        }
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("Posicion 1 : " +p1);
        System.out.println("Posicion 2 : " +p2);
        System.out.println(r);
                
    }
    
}
