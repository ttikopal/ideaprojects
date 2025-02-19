package Bingo;

import java.util.Scanner;

public class entrada {

    private static Scanner sc = new Scanner(System.in);

    public static String getTexto(String texto){
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

    public static char getOpcion(String texto){

        String caracter;
        do {
            caracter = getTexto(texto).toLowerCase();
        } while (
                caracter.length()!=1 || (
                        caracter.charAt(0) !='s' && caracter.charAt(0) !='n'));
        return caracter.charAt(0);
    }


    public static double getDouble(String texto){

        System.out.println(texto);

        return sc.nextDouble();

    }



}
