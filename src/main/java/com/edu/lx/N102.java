
package com.edu.lx;

import java.util.Scanner;


public class N102 {


    public static void main(String[] args) {
        
        
        //VARIABLES
        int o=0;
        
        int n[] = new int[4];
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese num  : ");
        System.out.println("Ingrese num 01 : ");
        n[0] = scan.nextInt();
        System.out.println("Ingrese num 02 : ");
        n[1] = scan.nextInt();
        System.out.println("Ingrese num 03 : ");
        n[2] = scan.nextInt();
        System.out.println("Ingrese num 04 : ");
        n[3] = scan.nextInt();
        
        
        //PROCESO
        
        int LS = n.length-1;
        
        Ordenamiento(n);
        
        //SALIDA
        System.out.println("Resultado");
        System.out.println("Orden : [0] : "+n[0]);
        System.out.println("Orden : [1] : "+n[1]);
        System.out.println("Orden : [2] : "+n[2]);
        System.out.println("Orden : [3] : "+n[3]);
        System.out.println("LS : " + LS);
                
                

    }
    
    //Metodo
    public static void Ordenamiento(int Num[])
    {
        //variabes
        int LS;
        int i,j;
        int aux;
        
        //arreglo
        int n[] = Num;
        //proceso
        
        
        LS=n.length-1;
        
        for (i = 0; i <=LS-1; i++) {
            for (j = 0; j <=LS-1; j++) {
                if (Num[j]> Num[j+1]) {
                    
                    aux = Num[j];
                    Num[j] = Num[j+1];
                    Num[j+1] = aux;
                }
            }
        }
                
        
        //salida
         Num = n;
        
    }
    
}
