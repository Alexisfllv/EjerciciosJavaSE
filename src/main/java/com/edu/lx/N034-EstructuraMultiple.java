
package com.edu.lx;

import java.util.Scanner;


public class N034 {

    
    public static void main(String[] args) {
        
        
        
        //CONSTANTES
        
        //VARIABLES
        
        String c,n;
        int res = 0;
        String rep;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese T- COLEGIO  : ");
        c = scan.nextLine();
        
        System.out.println("Ingrese Nivel : ");
        n = scan.nextLine();
        
        
        
        //PROCESO
        switch (c) {
            case "n":
            case "N":    
                if ((n).equals("a") || (n).equals("A")) {
                    res = 300;
                }else if ((n).equals("b") || (n).equals("B")) {
                    res = 200;
                }else if ((n).equals("c") || (n).equals("C")) {
                    res = 100;
                }                
                break;
            case "p":
            case "P":    
            switch (n) {
                case "A":
                case "a":
                    res = 400;
                    break;
                case "b":
                case "B":
                    res = 300;
                    break;
                case "C":
                case "c":
                    res = 200;
                    break;
                default:
                    break;
            }
                break;    

            default:
                rep = "DATO NO VALIDO";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Valor a pagar " + res);
        System.out.println("Sim :" );
    }
    
}
