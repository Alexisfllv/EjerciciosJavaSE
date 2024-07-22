
package com.edu.lx;

import java.util.Scanner;


public class N095 {


    public static void main(String[] args) {
        //VARIABLES
        String f1,f2="",c;
        int i,p;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese frase : ");
        f1 = scan.nextLine();
        //PROCESO
        
        p=0;
        f1 = f1.trim();
        for (i = 0; i <f1.length(); i++) {
            c = f1.substring(i,i+1);
            if (!c.equals(" ")) {
                c = String.valueOf((char)(c.codePointAt(0)+1));
            }
            f2 +=c;
        }
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("INCRIPT : " +f2);
    }
    
}
