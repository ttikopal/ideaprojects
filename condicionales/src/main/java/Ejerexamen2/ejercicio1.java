package Ejerexamen2;

import java.util.Arrays;

public class ejercicio1 {
    public static void main(String[] args) {

        int[][] array = new int[4][5];


        fillMatrix(array);
        showMatrix(array);



    }


    public static void fillMatrix(int[][] array){


        for (int i = 0;  i < array.length ; i++){
            for (int j =0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random()*100);
            }
        }

    }

    public static void showMatrix(int[][] array){

        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array[i].length;j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }


}
