
package com.edu.lx;

import java.util.Scanner;


public class N027 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        
        
        int num;
        String trad;
        
        //ENTRADA
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        num = scan.nextInt();
        //PROCESO
        
        switch (num) {
            case 1:
                trad = "uno";
                break;
            case 2:
                trad = "dos";
                
                break;
            case 3:
                trad = "tres";
                break;
            case 4:
                trad = "cuatro";
                break;
                
            case 5:
                trad = "cinco";
                break;
                
            case 6:
                trad = "seis";
                break;
                
            case 7:
                trad = "siete";
                break;
            
            case 8:
                trad = "ocho";
                break;
                
            case 9:
                trad = "nueve";
                break;
            default:
                throw new AssertionError();
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Letra : " + trad);
    }
    
}
