
package com.edu.lx;

import java.util.Scanner;



public class N003 {

    public static void main(String[] args) {
        
        
        //Variables
        float producto,igv,productofinal;
        //Entrada
        
        Scanner scan = new Scanner(System.in); //habilita la funcion scanner
        
        System.out.println("Ingrese precio del producto: ");
        producto = scan.nextFloat();
        
        //Proceso
        
        igv = producto * 0.19F; //
        productofinal = producto +  igv;
        
        //Salida
        
        System.out.println("RESULTADO");
        System.out.println("El igv es : "+ igv);
        System.out.println("El Precio total es : "+productofinal);
    }
    
}
