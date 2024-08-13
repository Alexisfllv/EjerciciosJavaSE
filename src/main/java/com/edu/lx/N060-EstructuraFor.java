
package com.edu.lx;

import java.util.Scanner;


public class N060 {

   
    public static void main(String[] args) {
        
        //VARIABLES
        int n,ni=0,np=0,i;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese numero : ");
        n = scan.nextInt();
        //PROCESO
        for (i = 1 ; i <= n; i++) {
            if (i % 2==0) {
                np = np +i;
            }else if (i %2 != 0) {
                ni = ni +i;
            }
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("suma de numeros pares : " +np);
        System.out.println("suma de numeros inpares : " + ni);
    }
    
}
