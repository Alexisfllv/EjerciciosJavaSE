
package com.edu.lx;

import java.util.Scanner;

public class N048 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        int i,n1,n2,s1 =0, s2 =0;
        String r ="";
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero 1 : ");
        n1 = scan.nextInt();
        
        System.out.println("Numero 2  : ");
        n2 = scan.nextInt();
        //PROCESO
        
        i =1;
        
        while (i <= n1 / 2) {            
            if (n1 % i  ==0) {
                s1 += i;
            }
            i++;
        }
        i =1;
        
        while (i <= n2 /2) {            
            if (n2 % i ==0) {
                s2 +=i;
            }
            i++;
        }
        
        if (n1 == s2 && n2 ==s1) {
            r= "Son amigos";
        }else{
            r = "No son Amigos";
        }
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("Res " +r);
    }
    
}
