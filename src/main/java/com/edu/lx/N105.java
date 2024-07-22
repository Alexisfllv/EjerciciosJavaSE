
package com.edu.lx;

import java.util.Scanner;


public class N105 {


    public static void main(String[] args) {
        
        //VARIABLES
        String f,fs;
        int i;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese texto : ");
        f = scan.nextLine();
        
        //PROCESO
        
        fs = SinEspacios(f);
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("Texto -f2 : " +fs);
        
        
    }
    
    //metodo
    
    public static String SinEspacios(String Txt)
    {
        //variables
        String fs="";
        String t = "";
        int i,p=0;
        int Tn;
        //proceso
        
        Txt = Txt.trim();
        Tn = Txt.length();
        
        for (i = 0; i < Tn; i++) {
            if (Txt.substring(i,i+1).equals(" ")) {
                t = Txt.substring(p,i);
                p = i+1;
                fs = fs+t;
            }
        }
        
        t = Txt.substring(p,i);
        fs=fs+t;
        
        //salida
        
        return fs;
    }
    
}
