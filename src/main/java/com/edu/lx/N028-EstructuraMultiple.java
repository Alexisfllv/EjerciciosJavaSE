
package com.edu.lx;

import java.util.Scanner;


public class N028 {

  
    public static void main(String[] args) {
        
        //VARIABLES
        
        int n1,n2,re;
        String op;
        
        
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor de operador : ");
        op = scan.nextLine();
        
        System.out.println("Valor 1 : ");
        n1 = scan.nextInt();
        
        System.out.println("Valor 2 : ");
        n2 = scan.nextInt();
        
        
        //PROCESO
        
        switch (op) {
            case "/":
                re = n1 / n2;
                break;
            case "*":
                re = n1 * n2;
                break;
            case "-":
                re = n1 - n2;
                break;    
            case "+":
                re = n1 + n2;
                break;    
            case "%":
                re = n1 % n2;
                break;    
                
            default:
                throw new AssertionError();
        }
        
        //SALIDA
        System.out.println("Resultado ");
        System.out.println("RE: " + re);
    }
    
}
