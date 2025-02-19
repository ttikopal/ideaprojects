package Ejercicios;

import java.util.Scanner;

public class entrada {

    private static Scanner sc = new Scanner(System.in);

    public static String getTexto(){
        return sc.nextLine();
    }

    public static int getInt(){
        return sc.nextInt();
    }
}
