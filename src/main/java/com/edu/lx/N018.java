
package com.edu.lx;

import java.util.Scanner;


public class N018 {

    
    public static void main(String[] args) {
        
        //CONSTANTES
        
        //VARIABLES
        
        float n1,n2,n3,m,i,n;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primer numero : ");
        n1 = scan.nextFloat();
        System.out.println("Ingrese segundo numero : ");
        n2 = scan.nextFloat();
        System.out.println("Ingrese tercer numero : ");
        n3 = scan.nextFloat();
        
        //PROCESO
        if (n1 > n2 && n1 > n3) {
            m = n1;
        }else{
            if (n2 >n1 && n2 >n3) {
                m = n2;  
            }else{
                m = n3;
            }
        }
        
        if ( n1 < n2 && n1 < n3){
           n = n1;
        }else{
            if (n2 < n1 && n2 <n3) {
                n = n2;
            }else{
                n = n3;
            }
        }
        
        i = (n1+n2+n3) - (m+n);
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("N Mayor " +m );
        System.out.println("N Intermedio " +i);
        System.out.println("N Menor "  + n);
    
        
         
        
    }
    
}
