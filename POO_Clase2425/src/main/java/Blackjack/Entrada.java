package Blackjack;

import java.util.Scanner;

public class Entrada {
    private static Scanner scanner = new Scanner(System.in);

    public static String getText(String texto){
        Scanner sc = new Scanner(System.in);
        System.out.println(texto);
        return sc.nextLine();
    }


    public static char getOpcion(String texto){
        String caracter;

        do{

            caracter = getText(texto).toLowerCase();

        }while(caracter.length() != 1 || (caracter.charAt(0) != 's' && caracter.charAt(0) != 'n'));

        return  caracter.charAt(0);
    }

}
