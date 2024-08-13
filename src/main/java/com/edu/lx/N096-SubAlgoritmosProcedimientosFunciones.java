
package com.edu.lx;

import java.util.Scanner;


public class N096 {

    public static void main(String[] args) {

        //VARIABLES
        
        int n1,n2,s;
      
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese num1 : ");
        n1 = scan.nextInt();
        System.out.println("Ingrese num2 : ");
        n2 = scan.nextInt();
        
        //PROCESO
        s = Sumar(n1,n2);
        
        //SALIDA
        System.out.println("RES");
        System.out.println("Suma  : " +s);
    }
    
    //METODO SUMAR:
    
    private static int Sumar(int Num1,int Num2)
    {
        //variables
        int s;        
        //proceso
        s = Num1 + Num2;
        //salida
        return s;
    }

    
    
}
