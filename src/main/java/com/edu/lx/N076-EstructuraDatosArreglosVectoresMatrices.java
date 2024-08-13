
package com.edu.lx;

import java.util.Scanner;

public class N076 {

    public static void main(String[] args) {
        
        //VARIABLES
        int i,j,c=0;
        
        int a[] = new int[4];
        
        int b[] = new int[4];
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Arreglo A : ");
        System.out.println("Ingrese num 1 : ");
        a[0] = scan.nextInt();
        
        System.out.println("Ingrese num 2 : ");
        a[1] = scan.nextInt();
        
        System.out.println("Ingrese num 3 : ");
        a[2] = scan.nextInt();
        
        System.out.println("Ingrese num 4 : ");
        a[3] = scan.nextInt();
        
        System.out.println("Arreglo B : ");
        System.out.println("Ingrese num 1 : ");
        b[0] = scan.nextInt();
        
        System.out.println("Ingrese num 2 : ");
        b[1] = scan.nextInt();
        
        System.out.println("Ingrese num 3 : ");
        b[2] = scan.nextInt();
        
        System.out.println("Ingrese num 4 : ");
        b[3] = scan.nextInt();
        
        
        //PROCESO
        
        for (i = 0; i <= a.length -1 ; i++) {
            
            for (j = 0; j <= b.length -1; j++) {
                
                if (a[i] == b [j]) {
                    
                    c= c+1;
                }
            }
        }
 
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Cantidad : " + c);
    }
    
}
