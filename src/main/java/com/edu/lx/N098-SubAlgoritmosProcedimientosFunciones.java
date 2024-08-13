
package com.edu.lx;

import java.util.Scanner;


public class N098 {


    public static void main(String[] args) {
        //VARIABLES
        int n1;
        String res="";
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero : " );
        n1 = scan.nextInt();
        //PROCESO
        Pares(n1);
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(res);
    }
    
    public static String Pares(int Num1)
    {
        //Variables
        String res="";
        //Proceso
        if (Num1 % 2 == 0) {
            res = "Numero par";
        }else{
            res = "Numero impar";
        }
        
        //Salida
        return res;
    }
    
}
