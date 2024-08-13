
package com.edu.lx;

import java.util.Scanner;


public class N038 {

  
    public static void main(String[] args) {
        //VARIABLES
        
        
        int d,m,a,dm = 0;
        String res;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dia : ");
        d = scan.nextInt();
        
        System.out.println("Ingrese mes : ");
        m = scan.nextInt();
        
        System.out.println("Ingrese año : ");
        a = scan.nextInt();
        
        //PROCESO
        
        switch (m) {
            case 1:
            case 3:    
            case 5: 
            case 7:
            case 8:
            case 10:
            case 12:
                if (dm == 31) {
                    
                }
                
                
                
                
                break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                
                if (dm == 30) {
                    
                }
                break;
            
            case 2:
                
                if (a %4 ==0) {
                    dm = 29;
                }else{
                    dm = 28;
                }
                break;
             
                
                
            default:
                throw new AssertionError();
        }
        if (d > 0 && d <=dm && m > 0 && m <=12 && a >=1) {
            res = "Correcto";
        }else{
            res = "Incorrecto";
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(" " + res);
    }
    
}
