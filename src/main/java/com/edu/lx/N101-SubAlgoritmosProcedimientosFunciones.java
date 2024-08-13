
package com.edu.lx;

import java.util.Scanner;


public class N101 {

    public static void main(String[] args) {
        //VARIABLES
        int s=0,i;
        
        //ARREGLOS
        
        int n[] = new int[5];
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese ARREGLO");
        System.out.println("Arreglo 1 : ");
        n[0] = scan.nextInt();
        
        System.out.println("Arreglo 2 : ");
        n[1] = scan.nextInt();
        
        System.out.println("Arreglo 3 : ");
        n[2] = scan.nextInt();
        
        
        System.out.println("Arreglo 4 : ");
        n[3] = scan.nextInt();
        
        System.out.println("Arreglo 5 : ");
        n[4] = scan.nextInt();
        
        
        //PROCESO
        
        s = SumaDeArreglos(n);
        
       
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("suma : " +s);
                
        
    }
    
    //METODO
    
    public static int SumaDeArreglos(int Num[])
    {
        //variables
        int s =0;
        int i;
        //entrada

        //proceso
        for (i = 0; i <= 4; i++) {
            s = s + Num[i];
        }
            
        
        //salida
        return s;
    }
    
}
