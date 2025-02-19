package org.example.chess;

import java.util.Scanner;

public class entrada {

    private static Scanner sc = new Scanner(System.in);

    public static String getTexto(String texto){
        sc = new Scanner(System.in);
        System.out.println(texto);
        return sc.nextLine();
    }

    public static int getInt(String texto){

        System.out.println(texto);
        return sc.nextInt();
    }
    public static char getChar(String texto){

        System.out.println(texto);
        return sc.next().charAt(0);

    }

    public static double getDouble(String texto){

        System.out.println(texto);

        return sc.nextDouble();

    }



}
