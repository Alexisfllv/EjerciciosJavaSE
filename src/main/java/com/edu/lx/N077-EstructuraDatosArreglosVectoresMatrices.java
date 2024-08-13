
package com.edu.lx;

import java.util.Scanner;


public class N077 {

 
    public static void main(String[] args) {
        
        
        //VARIABLES
        
        int i,j,tmp,LI,LS;
        
        //ARREGLO
        int n[] = new int[4];
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese num 1 : ");
        n[0] = scan.nextInt();
        
        System.out.println("Ingrese num 2 : ");
        n[1] = scan.nextInt();
        
        System.out.println("Ingrese num 3 : ");
        n[2] = scan.nextInt();
        
        System.out.println("Ingrese num 4 : ");
        n[3] = scan.nextInt();
            
        //PROCESO
        LI = 0;
        LS = n.length -1;
        
        for (i = LI; i <= LS -1 ; i++) {
            
            for (j = LI; j <= LS -1; j++) {
                
                
                if (n[j] > n[j+1]) {
                    tmp = n[j];
                    n[j] =  n[j +1];
                    n[j+1] = tmp;
                }
            }
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("ORDENADO");
        System.out.println("Numero 1 : " +n[0]);
        System.out.println("Numero 2 : " +n[1]);
        System.out.println("Numero 3 : " +n[2]);
        System.out.println("Numero 4 : " +n[3]);
    }
    
}
