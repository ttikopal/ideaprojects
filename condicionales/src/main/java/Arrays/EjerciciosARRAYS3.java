package Arrays;

public class EjerciciosARRAYS3 {
    public static void main(String[] args) {


        int[] array = new int[10];

        random(array);
        int suma = suma(array);
        System.out.println("La suma de los elementos del array es: " + suma);
        promedio(array, suma);

    }

    public static void random(int[] array) {

        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 100);
    }


    public static int suma(int[] array) {

        int suma = 0;

        for (int i = 0; i < array.length; i++)
            suma += array[i];

        return suma;
    }

    public static void promedio(int[] array, int suma) {

        System.out.println("El promedio de la suma de los elementos del array es: " + suma / array.length);

    }
}
