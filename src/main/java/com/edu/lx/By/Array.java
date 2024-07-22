
package com.edu.lx.By;


public class Array {

    
    public static void main(String[] args) {
        
        
        //Variables
        int n,i=0;
        String r="";
        
        //Arreglo
        
        String[]cars = {"Nissan","Volvo","Lexus"};
        int[]nums = {10,31,22,55};
        
        //Entrada
        
        //Proceso
        for (i = 0; i <= 2; i++) {
            r = r + cars[i];
        }
        
        //Salida
        System.out.println("RESULTADO");
        System.out.println("Carro : "+ r);
                
    }
    
}
