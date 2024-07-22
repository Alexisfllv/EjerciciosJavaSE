

package com.edu.lx;

import java.util.Scanner;


public class N001 {

    public static void main(String[] args) {
        
        //Variables
        
        int s,n1,n2;
        
        //Entrada
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar primer numero :" );
        n1 = scan.nextShort();
        System.out.println("Ingresar segundo numero :");
        n2 = scan.nextInt();
        
        
        //Proceso
        
        s= n1+n2;
        
        //Salida

        System.out.println("RESULTADO");
        System.out.println("Suma: "+s);
    }
}
