package Ejerexamen2;

public class EJERARRAYS321 {
    public static void main(String[] args) {

    int[][] array = new int[4][3];


    fillArray(array);
    show(array);
        System.out.println("Hay " + evenElements(array) + " numeros pares.");
    positionEven(array);
    }


    public static int random(){

        return (int)(Math.random()*10 );

    }

    public static void fillArray(int[][] array){

        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random();
            }
        }
    }

    public static void show(int[][] array){

        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int evenElements(int[][] array){

        int count = 0;

        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void positionEven(int[][] array){
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] % 2 == 0){
                    System.out.println("La posicion del numero par " + array[i][j] + " es la fila " + i + " y la columna "+ j);
                }
            }
        }
    }
}
