
package com.edu.lx;

import java.util.Scanner;


public class N086 {


    public static void main(String[] args) {
        //VARIABLES
        
        String nombre;
        
        int res = 0;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese texto : ");
        nombre = scan.nextLine();
        
        //PROCESO
        res = nombre.length();
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Cantidad : " +res);
               
                
    }
    
}
