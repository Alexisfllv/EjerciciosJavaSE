
package com.edu.lx;

import java.util.Scanner;


public class N044 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        int n,nr=0;
        int i;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese n : " );
        n = scan.nextInt();
        //PROCESO
        
        /*
        if (n % 5 == 0) {
            nr = n/5;
        }else{
            nr =0;
        }
        
        */
        //while
        
        i =1;
        while (i <=n) {         //11
            if (i %5 ==0) {
                nr=nr+1;
                
            }else if (n % 5 != 0) {
                nr =0;
            }
                
            i++;
        }
        
        
        //SALIDA
        
        System.out.println("res : " + nr);
    }
    
}
