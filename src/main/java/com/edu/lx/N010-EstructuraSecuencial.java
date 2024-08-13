
package com.edu.lx;

import java.util.Scanner;

public class N010 {

    
    public static void main(String[] args) {
        
        
        //CONSTANTES
        final int hora = 3600;
        final int minuto = 60;
        //VARIABLES
        
        int t,h,m,s;
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese segundos a convertir : ");
        t = scan.nextInt();
        
        //PROCESO
        
        h = t / hora;
        t = t%hora;
        m = t / minuto;
        s = t % minuto;
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Hora : " +h);
        System.out.println("Minuto : "+m);
        System.out.println("Segundo  : "+s);
    }
    
}
