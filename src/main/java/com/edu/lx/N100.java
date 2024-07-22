
package com.edu.lx;

import java.util.Scanner;


public class N100 {


    public static void main(String[] args) {

        //VARIABLES
        int n,f,i=0;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numer : ");
        n = scan.nextInt();
        //PROCESO
        f =FactorialNumero(n);
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Factorial :  " +f);             
    }
    
    //metodo
    public static int FactorialNumero(int Num){
        //variables
        int f=1;
        int i;
        //proceso
        for ( i = 1; i <= Num; i++) {
            f = f*i;
        }
        //salida
        return f;
        
    }
    
}
