package Arrays;

import java.util.Arrays;

public class EjerciciosARRAYS4 {
    public static void main(String[] args) {

        int[] array = new int[entrada.getInt("Introduce el tamaño del array: ")];

        int min = entrada.getInt("Introduce el limite inferior: ");
        int max = entrada.getInt("Introduce el limite superior: ");

        rellenarArray(array, min, max);
        show(array);
        System.out.println("El mayor del array es: " + mayorArray(array));


    }

    public static boolean esPrimo(int num) {

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;

    }

    public static int randomNumber(int min, int max) {

        int res = (int) (Math.random() * (max - min + 1)) + min;
        return res;
    }


    public static int primoAleatorio(int min, int max) {
        int aleatorio = randomNumber(min, max);
        int i = 0;
        while (!esPrimo(aleatorio)) {
            aleatorio = randomNumber(min, max);

            i++;
        }
        return aleatorio;

    }

    public static void rellenarArray(int[] array, int min, int max) {

        for (int i = 0; i < array.length; i++) {
            array[i] = primoAleatorio(min, max);
        }
    }

    public static void show(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int mayorArray(int[] array) {

        int mayor = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor)
                mayor = array[i];
        }
        return mayor;
    }
}
