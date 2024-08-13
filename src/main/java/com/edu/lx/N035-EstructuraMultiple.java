
package com.edu.lx;

import java.util.Scanner;


public class N035 {

   
    public static void main(String[] args) {
        // VARIABLES
        
        String ms;
        int anio,dias,mes;
        
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese Mes :  ");
        mes = scan.nextInt();
        
        System.out.println("Ingrese año : ");
        anio = scan.nextInt();
        
        //PROCESO
        
        switch (mes) {
            case 1:
                dias = 31;
                ms = "Enero";
                break;
            case 2:
                ms = "Febrero";
                if (anio %4 ==0) {
                    dias = 29;
                }else{
                    dias = 28;
                }
                break;
            case 3:
                dias = 31;
                ms = "Marzo";
                break;
    
            case 4:
                dias = 30;
                ms = "Abril";
                break;
            case 5:
                ms = "Mayo";
                dias = 31;
                break;
            case 6:
                ms = "Junio";
                dias = 30;
                break;
            case 7:
                ms = "Julio";
                dias = 31;
                break;
                
            case 8:
                ms = "Agosto";
                dias = 31;
                break;
            case 9:
                ms = "Septiembre";
                dias = 30;
                break;
            case 10:
                ms = "Octubre";
                dias = 31;
                break;
            case 11:
                ms = "Noviembre";
                dias = 30;
                break;
            case 12:
                ms = "Diciembre";
                dias = 31;
                break;
                
            default:
                ms = "Dato ingresado no valido";
                dias = 0;
        }
    
        System.out.println("RESULTADO");
        System.out.println("Mes :  "+ ms);
        System.out.println("Num dias : " + dias);
        
        //SALIDA
        
    }
    
}
