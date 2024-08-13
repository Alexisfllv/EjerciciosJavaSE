
package com.edu.lx;

import java.util.Scanner;

public class N075 {

   
    public static void main(String[] args) {
        
        //VARIABLES
        int i,p=0,nb;
        String r = "";
        //ARREGLOS
        int n[] = new int [7];
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese num 1 : ");
        n[0] = scan.nextInt();
        
        System.out.println("Ingrese num 2 : ");
        n[1] = scan.nextInt();
        
        System.out.println("Ingrese num 3 : ");
        n[2] = scan.nextInt();
        
        System.out.println("Ingrese num 4 : ");
        n[3] = scan.nextInt();
        
        System.out.println("Ingrese num 5 : ");
        n[4] = scan.nextInt();
        
        System.out.println("Ingrese num 6 : ");
        n[5] = scan.nextInt();
        
        System.out.println("Ingrese num 7 : ");
        n[6] = scan.nextInt();
        
        System.out.println("Ingrese numero a buscar : ");
        nb = scan.nextInt();
        
        //PROCESO
        
        //nb = 4
        //
        r = "NO EXISTE";
        
        
        for (i = 0; i <= n.length -1; i++) {
            
            if (n[i] == nb ) {
                r = "SI EXISTE";
                p = i +1;
                break;
                
            }
            
        }
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r);
        System.out.println("Posicion : " + p);
        
    }
    
}
