
package com.edu.lx;

import java.util.Scanner;


public class N029 {

   
    public static void main(String[] args) {
        
        //VARIABLES
        int a;
        String re,le;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese letra : ");
        le = scan.nextLine();
        //PROCESO
        
        switch (le) {
            case ("A"):
            case "a":
                re = "Vocal A";
                break;
            case ("E"):
            case "e":
                re = "Vocal E";
                break;
               
            case ("I"):
            case "i":
                re = "Vocal I";
                break;
            case ("O"):
            case "o":
                re = "Vocal O";
                break;
            case ("U"):
            case "u":
                re = "Vocal U";
                break;
            default:
                re = "no es ninguna vocal";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Volca : " + re );
    }
    
}
