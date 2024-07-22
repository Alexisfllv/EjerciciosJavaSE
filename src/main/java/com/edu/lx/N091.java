
package com.edu.lx;

import java.util.Scanner;

public class N091 {


    public static void main(String[] args) {
        //VARIABLES
        String n,res;
        int c;
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre  : ");
        n = scan.nextLine();
        System.out.println("Ingrese cantidad : ");
        c = scan.nextInt();
        
                
        //PROCESO
        
        res = n.substring(0,c);
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Nombre : " +res);
    }
    
}
