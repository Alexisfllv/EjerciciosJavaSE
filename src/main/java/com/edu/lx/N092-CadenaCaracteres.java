
package com.edu.lx;

import java.util.Scanner;

public class N092 {


    public static void main(String[] args) {
        //VARIABLES
        String p,t,u,l;
        String n,c;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre : ");
        n = scan.nextLine();
        
        
        //PROCESO  
        //PEGGY
        
        p = n.substring(0,1);
        t = n.substring(2,3);
        u = n.substring(n.length()-1);
        l = String.valueOf(n.trim().length());
        c = (p+t+u+l).toUpperCase();
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Codigo : " +c);
                
    }
    
}
