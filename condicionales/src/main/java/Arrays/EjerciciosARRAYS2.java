package Arrays;

import Arrays.entrada;

import java.util.Arrays;

public class EjerciciosARRAYS2 {
    public static void main(String[] args) {


        int t = entrada.getInt("Introduce el tamaño de la matriz: ");

        int[] array = new int[t];

        rellenarMatriz(array, 10, 50);
        show(array);
        sumar(array);

    }

    public static void rellenarMatriz(int[] array, int min, int max) {

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber(min, max);
        }

    }


    public static int randomNumber(int min, int max) {

        int res = (int) (Math.random() * (max - min + 1)) + min;
        return res;
    }

    public static void show(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void sumar(int[] array) {

        int suma = 0;

        for (int j = 0; j < array.length; j++) {
            suma += array[j];
            System.out.println(suma);
        }
        System.out.println("La suma total de los elementos del array es de: " + suma);


    }

}
