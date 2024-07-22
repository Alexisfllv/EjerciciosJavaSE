
package com.edu.lx;

import java.util.Scanner;


public class N021 {

    
    public static void main(String[] args) {
        
        //CONSTANTES
        
        //VARIABLES
        
        float c ;
        String r = "";
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese temperatura : ");
        c = scan.nextFloat();
        
        
        //PROCESO
        
        if (c < 10 ) {
            r = "FRIO";  
        }
        if (c >= 10 && c <= 20) {
            r = "NUBLADO";
        }
        if (c >= 21 && c <= 30) {
            r = "CALOR";
        }
        if (c > 30 ) {
            r = "HARTO CALOR";  
        }
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("La temperatura es : " +r);
    }
    
}
