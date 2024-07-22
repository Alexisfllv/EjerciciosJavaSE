
package com.edu.lx;

import java.util.Scanner;


public class N085 {


    public static void main(String[] args) {
        
        
        //VARIABLES
        int i,j;
        
        int ob,x,LS;
        //ARREGLOS
        int n[][] = new int[3][3];
        
        int o[] = new int[9];
        
        //ENTRADAS
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese num 1 : ");
        n[0][0] = scan.nextInt();
        
        System.out.println("Ingrese num 2 : ");
        n[0][1] = scan.nextInt();
        
        System.out.println("Ingrese num 3 : ");
        n[0][2] = scan.nextInt();
        
        System.out.println("Ingrese num 4 : ");
        n[1][0] = scan.nextInt();
        
        System.out.println("Ingrese num 5 : ");
        n[1][1] = scan.nextInt();
        
        System.out.println("Ingrese num 6 : ");
        n[1][2] = scan.nextInt();
        
        System.out.println("Ingrese num 7 : ");
        n[2][0] = scan.nextInt();
        
        System.out.println("Ingrese num 8 : ");
        n[2][1] = scan.nextInt();
        
        System.out.println("Ingrese num 9 : ");
        n[2][2] = scan.nextInt();
        
        //PROCESOS
        
        //#ANALISIS
        
        x =0 ;
        for (i = 0; i <= 2; i++) {
            
            for (j = 0; j <= 2; j++) {
                
                
                //
                o[x] = n[i][j];
                x++;
            }
            
        }
        
        LS = o.length -1;
        for (i = 0; i <= LS -1; i++) {
            for (j = 0; j <= LS -1; j++) {
                if (o[j] > o [j+1]) {
                    
                    ob = o[j+1];
                    o[j+1] = o[j];
                    o[j] = ob;
                }
            } 
        }
        x =0;
            for (i = 0; i <= 2; i++) {
                for (j = 0; j <= 2; j++) {
                    n[i][j] = o[x];
                    x++;
                }
            }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Numero [0][0] : "+n[0][0]);
        System.out.println("Numero [0][1] : "+n[0][1]);
        System.out.println("Numero [0][2] : "+n[0][2]);
        System.out.println("Numero [1][0] : "+n[1][0]);
        System.out.println("Numero [1][1] : "+n[1][1]);
        System.out.println("Numero [1][2] : "+n[1][2]);
        System.out.println("Numero [2][0] : "+n[2][0]);
        System.out.println("Numero [2][1] : "+n[2][1]);
        System.out.println("Numero [2][2] : "+n[2][2]);
        
    }
    
}
