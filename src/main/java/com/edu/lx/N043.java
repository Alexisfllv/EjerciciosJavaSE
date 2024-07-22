
package com.edu.lx;

import java.util.Scanner;


public class N043 {

   
    public static void main(String[] args) {
        
        
        //VARIABLES
        int ni,nf;
        int nr=0;
        int i;
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar numero inicial : ");
        ni = scan.nextInt();
       
        System.out.println("Ingresar numero final : ");
        nf = scan.nextInt();
        //PROCESO
        
        i =0;
        i = ni+1;
        
        while (i <nf) {            
            if (i % 2 ==0) {
                nr = nr +1;
            }
            
            i = i+1;
        }
        
        //SALIDA
        
        System.out.println("Numeros de diferencia : " +nr);
    }
    
}
