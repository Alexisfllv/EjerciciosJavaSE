
package com.edu.lx;

import java.util.Scanner;

public class N026 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        
        int dato;
        String resultado = "";
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero de estacion : ");
        dato = scan.nextInt();
        
        
        
        
        
        //PROCESO
        
        switch (dato) {
            case 1:
                resultado = "VERANO";
                break;
            case 2:
                resultado = "OTOÑO";
                break;
            case 3:
                resultado = "INVIERNO";
                break;
            case 4:
                resultado = "PRIMAVERA";
                break;
            
                
        }
        //SALIDA
        
        System.out.println("Estacion es : " + resultado);
        
    }
    
}
