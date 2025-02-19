package ejerexamen;

import java.util.Scanner;

public class ejerexamen71 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = sc.nextLine();

        System.out.println("Reemplaza la palabra: ");
        String reemplazada = sc.nextLine().toLowerCase();

        System.out.println("Por la palabra: ");
        String nueva = sc.nextLine();

        String solucion = cambioPalabra(frase, reemplazada, nueva);
        System.out.println(solucion);
    }

    public static String cambioPalabra(String frase, String nueva, String reemplazada) {

        String fraseCambiada = "";
        frase = frase.toUpperCase();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == reemplazada.charAt(0)) {
                // Mirar si la palabra es igual a esa posición de la frase
                boolean igual = true;
                int j = 0;
                while (j < reemplazada.length() && igual) {
                    if (reemplazada.charAt(j) != frase.charAt(i + j)) {
                        igual = false;
                        j++;
                    }
                }
                if (igual) {
                    for (int k = 0; k < nueva.length(); k++) {
                        fraseCambiada += nueva.charAt(k);
                    }
                    // i += reeplazada.length(); // Situar la i al final de la palabra antigua en la frase
                } else {
                    fraseCambiada += frase.charAt(i);
                }

            } else {
                fraseCambiada += frase.charAt(i);
            }
        }
        return fraseCambiada;
    }
}