
package com.edu.lx;

import java.util.Scanner;


public class N039 {

    
    public static void main(String[] args) {
        
        //VARIABLES
        int d1,m1,a1;
        String res;
        int d2  =0,m2=0,a2=0,dm = 0;
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese dia : ");
        d1 = scan.nextInt();
        
        System.out.println("ingrese mes : ");
        m1 = scan.nextInt();
        
        System.out.println("ingrese año : ");
        a1 = scan.nextInt();
        
        //PROCESO
        
        switch (m1) {
            case 1:
            case 3:    
            case 5: 
            case 7:
            case 8:
            case 10:
            case 12:
                if (dm == 31) {
                    break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                
                if (dm == 30) {
                    
                }
                break;
            
            case 2:    
                
                if (a1 %4 ==0) {
                    dm = 29;
                }else{
                    dm = 28;
                }
                break;
             
                
                
            default:
                throw new AssertionError();    
                
                
                
        }
        
        d1 =  d1+1;
        
        if (d1 > dm) {
            d1 =1;
            m1++;
            if (m1 == 13) {
                m1=1;
                a1++;
                
            }
            
        }
            
            
        
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("DIA : "+ d1);
        System.out.println("MES : " + m1);
        System.out.println("AÑO : " + a1);
    }
    
}
