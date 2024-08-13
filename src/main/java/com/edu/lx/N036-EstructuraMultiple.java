
package com.edu.lx;

import java.util.Scanner;


public class N036 {

   
    public static void main(String[] args) {
        
        
        //VARIABLES
        int ca,pro,pre = 0;
        String res ="";
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Calidad : ");
        ca = scan.nextInt();
        
        System.out.println("Ingrese Producto : ");
        pro = scan.nextInt();
        
        
        
        //PROCESO
        
        switch (pro) {
            case 1:
                switch (ca) {
                    case 1:
                        pre = 5000;
                        break;
                    case 2:
                        pre = 4500;
                        break;
                    case 3:
                        pre = 4000;
                        break;
                        default:
                        pre = 0;
                        res  = "ERROR C1";
                    
                }
                break;
                
            case 2 :
                switch (ca) {
                    case 1:
                        pre = 4500;
                        break;
                    case 2:
                        pre = 4000;
                        break;
                    case 3:
                        pre = 3500;
                        break;
                        default:
                        pre = 0;
                        res  = "ERROR C2";
                    
                }
                break;
            
            case 3 :
                switch (ca) {
                    case 1:
                        pre = 4000;
                        break;
                    case 2:
                        pre = 3500;
                        break;
                    case 3:
                        pre = 3000;
                        break;
                    default:
                    pre = 0;
                    res  = "ERROR C3";    
                        
                }
                break;
            default:
                pre = 0;
                res  = "ERROR 00";
        }
        
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("Precio : " + pre);
        System.out.println("Rpt : " + res);
        
        
    }
    
}
