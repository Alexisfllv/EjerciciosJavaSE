
package com.edu.lx;

import java.util.Scanner;


public class N033 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        
        int pt;
        String res = "";
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese puntaje : ");
        pt = scan.nextInt();
        
        
        //PROCESO
        
        if (pt >=100) {
            res = "Sistemas";
        }else if (pt >= 90 && pt<= 99) {
            res = "Electronica";
        }else if (pt >= 80 && pt>=89) {
            res = "Industrial";
        }else if (pt >=70 && pt>=79) {
            res = "Administracion";
        }else{
            res = "NO ingreso";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Ingreso a : " + res);
    }
    
}
