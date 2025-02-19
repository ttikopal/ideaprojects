package Ejerexamen2;

public class ARRAYS2 {
    public static void main(String[] args) {

        int[] array = new int[entrada.getInt("Introduce el tamaño del array: ")];

        rellenarArray(array);
        mostrarArray(array);
        System.out.println("La suma de los numeros es de: " + sumarElementos(array));

    }

    public static int randomNumber(int min, int max){

        int num = (int)(Math.random()* (max - min + 1) + min);

        return num;

    }

    public static void rellenarArray(int[] array){

       int min = entrada.getInt("Introduce el rango inferior: ");
        int max = entrada.getInt("Introduce el rango superior: ");

        for (int i = 0; i < array.length;i++){

            array[i] = randomNumber(min,max);

        }
    }

    public static int sumarElementos(int[] array){
        int suma = 0;

        for (int i = 0; i < array.length;i++) {
            suma += array[i];
        }
        return suma;
    }

    public static void mostrarArray(int[] array){
        for (int i : array)
            System.out.println(i);
    }
}
