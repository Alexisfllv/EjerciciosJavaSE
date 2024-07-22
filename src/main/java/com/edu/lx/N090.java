
package com.edu.lx;

import java.util.Scanner;


public class N090 {

   
    public static void main(String[] args) {
       
        //VARIABLES
        
        String caracter ;
        String res;
        
        int convert;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Caracter : " );
        caracter = scan.nextLine();
        
        //PROCESO
        convert = caracter.toUpperCase().codePointAt(0);
        
        if (convert >= 48 && convert <=57) {
            res = "Es un numero";
        }else if
            (convert >=65 && convert <=90)
        {
            res = "Es una Letra";
        }else {
            res = "Es un simbolo";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(res);
                
    }
    
}
