
package com.edu.lx;

import java.util.Scanner;


public class N040 {

    public static void main(String[] args) {
        
        
        //VARIABLES
        int ne;
        int u,d,c,m;
        String re = "";
        //ENTRADA
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero  : ");
        ne = scan.nextInt();
        
        //PROCESO
        
        if (ne <= 3999) {
            
            u = ne % 10;
            ne = ne/ 10;
            d = ne%10;
            ne = ne /10;
            c = ne % 10;
            ne = ne/10;
            m = ne%10;
            
            
            switch (m) {
                case 1:
                    re="M";
                    
                    break;
                case 2:
                    re = "MM";
                    break;
                case 3: 
                    re = "MMM";
                    break;
                                      
            }
            switch (c) {
                case 1:
                    re=re+"C";   
                    break;
                case 2:
                    re = re+"CC";
                    break;
                case 3: 
                    re = re+"CCC";
                    break;
                case 4: 
                    re = re+"CD";
                    break;    
                case 5:
                    re=re+"D";   
                    break;
                case 6:
                    re = re+"DC";
                    break;
                case 7: 
                    re = re+"DCC";
                    break;
                case 8: 
                    re =re+ "DCCC";
                    break;    
                case 9: 
                    re = re+"CM";
                    break; 
                                      
            }
            switch (d) {
                case 1:
                    re=re+"X";              
                    break;
                case 2:
                    re = re+"XX";
                    break;
                case 3: 
                    re = re+"XXX";
                    break;
                case 4:
                    re=re+"XL";   
                    break;
                case 5:
                    re = re+"L";
                    break;
                case 6: 
                    re =re+ "LX";
                    break;
                case 7:
                    re=re+"LXX";   
                    break;
                case 8:
                    re = re+"LXXX";
                    break;
                case 9: 
                    re = re+"XC";
                    break;                          
            }
            switch (u) {
                case 1:
                    re=re+"I";              
                    break;
                case 2:
                    re = re+"II";
                    break;
                case 3: 
                    re = re+"III";
                    break;
                case 4:
                    re=re+"IV";   
                    break;
                case 5:
                    re = re+"V";
                    break;
                case 6: 
                    re =re+ "VI";
                    break;
                case 7:
                    re=re+"VII";   
                    break;
                case 8:
                    re = re+"VII";
                    break;
                case 9: 
                    re = re+"IX";
                    break;                          
            }
        }
        
        //SALIDA
        
        System.out.println("RESULTADO");
        System.out.println("Valor : " + re);
    }
    
}
