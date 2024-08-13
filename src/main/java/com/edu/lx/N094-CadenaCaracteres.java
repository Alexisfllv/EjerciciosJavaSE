
package com.edu.lx;

import java.util.Scanner;


public class N094 {

    public static void main(String[] args) {
        
        //VARIABLES
        String f1,f2="",t;
        int i ,p;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese frase : ");
        f1 = scan.nextLine();
        
        //PROCESOs
        p =0;
        f1 = f1.trim();
        
        for (i = 0; i < f1.length(); i++) {
            if (f1 .substring(i,i+1).equals(" ")) {
                t = f1.substring(p,i);
                p = i+1;
                f2 = f2+t;
            }
        }
        
        t = f1.substring(p,i);
        f2 = f2+t;
        
        
        //SSALIDA
        System.out.println("RESULTADO");
        System.out.println("Frase sin espacios: " +f2);
    }
    
    
    
}
