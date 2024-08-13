
package com.edu.lx;

import java.util.Scanner;

public class N093 {


    public static void main(String[] args) {
        
        //VARIABLES
        String fr,le;
        int c=0,i;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Frase : ");
        fr = scan.nextLine();
        
        System.out.println("Letra : ");
        le = scan.nextLine();
        //PROCESO
        for (i = 0; i <=fr.length()-1; i++) {
            if (fr.toUpperCase().substring(i,i+1).equals(le.toUpperCase())) {
                c++;
            }
        }

        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Cantidad : " +c);
                
    }
    
}
