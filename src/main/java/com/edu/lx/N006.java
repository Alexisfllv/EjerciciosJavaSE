
package com.edu.lx;

import java.util.Scanner;

public class N006 {

    public static void main(String[] args) {
        
        //Variables
        int n,n1,r;
        
        //Entrada
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero para INVERSE : ");
        n = scan.nextInt();
        //Proceso
        
        r = n% 10;
        n = n/10;
        n1 = r*10;
        
        r = n%10;
        n = n/10;
        n1 = (n1 + r)*10;
        
        r = n % 10;
        n = n/10;
        n1 = (n1+ r)*10;
        
        r = n % 10;
        n = n/10;
        n1 = (n1+ r)*10;
        
        n1 = n1+n;
     
        //Salida
        System.out.println("RESULTADO");
        System.out.println("Valor : "+n1);
    }
    
}
