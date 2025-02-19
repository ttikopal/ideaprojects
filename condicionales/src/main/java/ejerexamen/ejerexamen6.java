package ejerexamen;

import java.util.Scanner;

public class ejerexamen6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero de la matriz: ");

        int num = teclado.nextInt();

        teclado.nextLine();


        for (int i = 1; i<=num;i++){
            for (int j=1; j<=num;j++){
                if (i == j){
                    System.out.print(i + " ");
                } else System.out.print(0 + " ");

            }
            System.out.println();
        }

        System.out.println("Introduce la letra a sustituir: ");
        String letra = teclado.nextLine();

        for (int i = 1; i<=num;i++){
            for (int j=1; j<=num;j++){
                if (i == j){
                    System.out.print(i + " ");
                } else System.out.print(0 + " ");

            }
            System.out.println();
        }


    }
}
