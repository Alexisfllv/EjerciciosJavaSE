
package com.edu.lx;

import java.util.Scanner;


public class N031 {

   
    public static void main(String[] args) {
        
        //VARIABLES
        
        
        int num = 0;
        String re;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nota : ");
        num = scan.nextInt();
        
        //PROCESO
        if (num <= 5 ) {
            re = "Pesimo :( ";
            
        }else if (num <=10 && num>=6) {
            re = "Malo";
        }else if (num <=11 && num>=14) {
            re = "Regular";
        }else if (num <=17 && num>=15) {
            re = "Bueno";
        }else if (num <=20 && num>=18) {
            re = "Excelente";
        }else{
            re = "DATO INVALIDO";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Estado : " + re);
        
    }
    
}
