package Ejerexamen2;

import java.util.Arrays;

public class ejercicio3 {
    public static void main(String[] args) {

        int rows = entrada.getInt("Introduce el numero de filas");
        int col = entrada.getInt("Introduce el numero de columnas");

        int [][] array = new int[rows][col];

        int[] pares = new int[cantidadPares(array)];

        fillArray(array);
        showArray(array);
        rellenarPares(array,pares);

        System.out.println(Arrays.toString(pares));


    }

    public static int randomNumber(int min, int max){

        int num =  (int)(Math.random()* (max - min + 1) + min);

        return num;

    }

    public static void fillArray(int[][] array){

        int min = entrada.getInt("Introduce min: ");
        int max = entrada.getInt("Introduce max: ");

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array[i].length;j++){
                array[i][j] = randomNumber(min,max);
            }
        }

    }

    public static void showArray(int[][] array){
        for (int i = 0; i< array.length;i++){
            for (int j = 0; j< array[i].length;j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int cantidadPares(int[][] array){

        int cont = 0;

        for (int i = 0; i<array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                if (array[i][j]%2 == 0){
                    cont++;
                }
            }
        }
    return cont;
    }

    public static void rellenarPares(int[][] array,int[] pares){

        for (int i = 0; i<array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                if (array[i][j]%2 == 0){
                    pares[j] = array[i][j];
                }
            }
        }

    }


}
