

package com.edu.lx;

import java.util.Scanner;

public class N071 {

    public static void main(String[] args) {
        
        //VARIABLES
        int s = 0,i;
        
        //ARREGLO
        int n[] = new int[5];
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
        
        for (i = 0;  i<= 4; i++) {
            s = s + n[i];
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Suma : " +s);
    }
    
}
