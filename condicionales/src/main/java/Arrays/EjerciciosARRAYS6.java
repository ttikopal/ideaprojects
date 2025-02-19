package Arrays;

import java.util.Arrays;

public class EjerciciosARRAYS6 {
    public static void main(String[] args) {


        int numeros = entrada.getInt("Cuántos números tiene tu dni?");
        char[] dni = new char[numeros];
        char[] letras = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


        pedirDni(dni, numeros);
        calcularLetra(dni, letras);
    }


    public static void pedirDni(char[] dni, int numeros) {


        if (numeros >= 1 && numeros <= 8) {
            for (int i = 0; i < numeros; i++) {
                dni[i] = entrada.getChar("Introduce un numero de tu dni: ");
            }
        }
    }

    public static int transformar(char[] dni) {

        String n = "";
        for (int i = 0; i < dni.length; i++) {
            n += dni[i];
        }
        return Integer.parseInt(n);
    }

    public static void calcularLetra(char[] dnis, char[] letras) {

        int n = transformar(dnis);

        int posicion = n % 23;

        System.out.println("La letra para el DNI " + n + " es: " + letras[posicion]);

    }
}
