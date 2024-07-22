
package com.edu.lx;

import java.util.Scanner;

public class N065 {

    public static void main(String[] args) {
        //VARIABLE
        int ni,nf,cp=0,cn=0,i;
        //ENTRADA
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar numero inicial : ");
        ni = scan.nextInt();
        
        System.out.println("Ingresar numero final : ");
        nf = scan.nextInt();
        
        
        //PROCESO
        
        for (i = ni; i < nf; i++) {
            if (i < 0 ) {
                cn = cn+1;
            }else{
                cp = cp +1;
            }
                
        }
        
        //SALIDA
        System.out.println("RESULTADO");
        System.out.println("Numeros negativos : " + cn);
        System.out.println("Numeros positivos : " + cp);
                
    }
    
}
