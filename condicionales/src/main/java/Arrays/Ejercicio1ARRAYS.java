package Arrays;

//Crea un array de 10 números, los valores se ingresarán por teclado.
//Luego, muestra por consola el índice y el valor de todos los elementos.
//Debes realizar dos métodos, uno para rellenar los valores de los elementos
//y otro para mostrarlos.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1ARRAYS {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] manolo) {

        int[] array = new int[10];
        System.out.println("Introduce los numeros: ");
        rellenar(array);
        show(array);
    }

    public static void rellenar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void show(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Índice del array: " + i + ", valor del elemento en el array: " + array[i]);

        }
    }
}
