package com.edu.lx;

import java.util.Scanner;

public class N089 {

    public static void main(String[] args) {
        //VARIABLES
        String v;
        String r;
        //ENTRADA

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese  : ");
        v = scan.nextLine();
        //PROCESO
        v = v.toUpperCase();

        switch (v) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                r = "Es una Vocal";
                break;

            default:
                r = "NO ES VOCAL";
        }

        //SALIDA
        System.out.println("RESULTADO");
        System.out.println(r);
    }

}
