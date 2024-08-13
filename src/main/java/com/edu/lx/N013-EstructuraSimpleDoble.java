
package com.edu.lx;

import java.util.Scanner;


public class N013 {


    public static void main(String[] args) {
        
        //CONSTANTES
        
        //VARIABLES
        char v ;
        String r = "";
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese letra a verificar : ");
        v = scan.next().charAt(0);
        
        
        //PROCESO
        
        r = "No es vocal ";
        
        
        if (v == 'a' || v == 'A') {
            r = "Es la vocal a";
            
        }
        
        if (v == 'e' || v == 'E') {
            r = "Es la vocal e";
            
        }
        
        if (v == 'i' || v == 'I') {
            r = "Es la vacal i";
            
        }
        
        if (v == 'o' || v == 'O' ) {
            r = "Es la vocal o";
            
        }
        if (v == 'u' ||v == 'U') {
            r = "Es la vocal u";
        }
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("Vocal : "+ r);
    }
    
}
