
package com.edu.lx;

import java.util.Scanner;

public class N030 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        
        
        int num;
        String stacion;
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : ");
        num = scan.nextInt();
        
        
        //PROCESO
        
        switch (num) {
            case 1:
            case 2:
            case 3:
                stacion = "VERANO";
                break;
            
            case 4:
            case 5:
            case 6:
                stacion = "OTOÑO";
                break;
            case 7:
            case 8:
            case 9:
                stacion = "INVIERNO";
                break;
            case 10:
            case 11:
            case 12:
                stacion = "PRIMAVERA";
                break;
            
                
            default:
                stacion = "DATO NO VALIDO";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Estacion : " + stacion);
    }
    
}
