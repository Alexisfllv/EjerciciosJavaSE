
package com.edu.lx;

import java.util.Scanner;


public class N097 {


    public static void main(String[] args) {
        //VARIABLES
        int n1,n2,nm;
        
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese numero 1  : ");
        n1 = scan.nextInt();
        System.out.println("Ingrese numero 2  : ");
        n2 = scan.nextInt();
        //PROCESO
        
        nm = Mayor(n1,n2);
        
        //SALIDA
        System.out.println("RES");
        System.out.println("Num mayor : " +nm);
    }

    private static int Mayor(int Num1 , int Num2)
    {
      //variables
      int nm=0;
      
      //proceso
      
        if (Num1 > Num2) {
            nm = Num1;
        }else{
            nm = Num2;
        }
        
        //salida
        return nm;
    }
    
}
