
package com.edu.lx;

import java.util.Scanner;

public class N088 {


    public static void main(String[] args) {
        //VARIABLES
        String nom;
        int nr;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese texto : ");
        nom = scan.nextLine();
        
        //PROCESO
        nr = nom.codePointAt(0);
        
        
        //SALIDA
        System.out.println("Codigo ASCII : " +nr);
    }
    
}
