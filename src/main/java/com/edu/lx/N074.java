
package com.edu.lx;

import java.util.Scanner;


public class N074 {

    
    public static void main(String[] args) {
        //VARIABLES
        int i,c=0;
        
        boolean flag;
        //ARREGLO
        int n[] = new int [5];
        
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
        
        System.out.println("Ingrese num 5 : ");
        n[4] = scan.nextInt();
        
        //PROCESO
        for ( i = 0; i <=4; i++) {
            flag = true;
            for (int j = 2; j <=n[i]/2; j++) {
                if (n[i] % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                c= c+1;
            }
        }
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Cantidad  de Primos  : " +c);
    }
    
}
