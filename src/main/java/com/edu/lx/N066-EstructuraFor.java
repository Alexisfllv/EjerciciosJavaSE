package com.edu.lx;

import java.util.Scanner;

public class N066 {

    public static void main(String[] args) {

        //VARAIBLES
        int ni, nf, m, i,nr=0;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Numero inicial : ");
        ni = scan.nextInt();
        
        System.out.println("Numero final : ");
        nf = scan.nextInt();
        
        System.out.println("Multiplo : ");
        m = scan.nextInt();

        //PROCESO
        
        /*
            ni =1
            nf =5  
            m  =2
            
            
        
        */

        for (i  = ni; i <= nf; i++) {  //i = 6;  6 <= 5 ;5= 1 +1;
            if (i % m ==0) {           //5 % 2 = 0;
                nr = nr +1;            //2 = 1 +1; 
            }
        }
        //SALIDA(i  = ni; i <= nf; i++) 
        System.out.println("RESULTADO");
        System.out.println("Cantidad : " + nr);
    }

}
