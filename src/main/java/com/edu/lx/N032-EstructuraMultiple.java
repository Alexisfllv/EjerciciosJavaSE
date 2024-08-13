
package com.edu.lx;

import java.util.Scanner;


public class N032 {

    
    public static void main(String[] args) {
        //Variables
        int mes,dia = 0;
        String re;
        //Entrada
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese num-dia: ");
        dia = scan.nextInt();
        
        System.out.println("Ingrese num-mes : ");
        mes = scan.nextInt();
        //Proceso
        switch (mes) {
            case 1:
            case 2:
            case 3:
                re = "VERANO";
                if (mes == 3 && dia>20) {
                    re = "OTOÑO";
                }               
                break;
                
            case 4:
            case 5:
            case 6:
                re = "OTOÑO";
                if (mes == 6 && dia>21) {
                    re = "INVIERNO";
                }               
                break;
            case 7:
            case 8:
            case 9:
                re = "INVIERNO";
                if (mes == 9 && dia>22) {
                    re = "PRIMAVERA";
                }               
                break;
                
            case 10:
            case 11:
            case 12:
                re = "PRIMAVERA";
                if (mes == 12 && dia>20) {
                    re = "VERANO";
                }               
                break;
                
                
                
                
            default:
                re = "dato fecha no existente";
        }
        //Salida
        System.out.println("RESULTADO");
        System.out.println("Estacion : " + re);
    }
    
}
