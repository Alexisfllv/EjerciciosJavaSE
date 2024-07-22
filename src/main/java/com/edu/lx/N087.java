
package com.edu.lx;

import java.util.Scanner;


public class N087 {

  
    public static void main(String[] args) {
        
        //VARIABLES
        String nombre,apellido;
        String full;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre : ");
        nombre = scan.nextLine();
        
        System.out.println("Ingrese apellido : ");
        apellido = scan.nextLine();
        
        //PROCESO
        
        full = nombre +" - "+apellido;
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Full : " +full);
    }
    
}
