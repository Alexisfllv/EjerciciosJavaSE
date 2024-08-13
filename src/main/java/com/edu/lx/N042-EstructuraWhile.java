
package com.edu.lx;

import java.util.Scanner;


public class N042 {

   
    public static void main(String[] args) {
        
        //VARIABLE
        
        
        int ni,nf,c=0;
        int i;
        
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero inicial : ");
        ni = scan.nextInt();
        
        System.out.println("Numero final : ");
        nf = scan.nextInt();
        
        
        
        
        //PROCESO
        /*
        i = ni;       //1
        while (i < nf) {  //    1 <6         
            c = i-ni; //1-2 = 3   //                  //0+1+2+3+4
            i++;
        }
        */
        
        //5-9
        i = ni + 1;  //6
        while (i < nf) {            //6<9 / 7<9
            c +=1;      //c+1 = 
            i++;
        }
                
                
        //SALIDA
        
        
        System.out.println("RESULTADO");
        System.out.println("Cantidad : " + c);
    }
    
}
