package Ejerexamen2;

public class ARRAYS4 {
    public static void main(String[] args) {


        int[] array = new int[entrada.getInt("Introduce el tamaño del array")];
        rellenarArray(array);
        show(array);


    }

    public static int randomNumber (int min, int max){

        return (int)(Math.random()*(max - min + 1) + min);

    }

    public static boolean esPrimo(int num){
         boolean primo = true;

        if (num <= 1) {
            return false;
        }
         for (int i = 2; i <= Math.sqrt(num); i++){
             if (num%i == 0) primo = false;
         }

         return primo;

    }

    public static void rellenarArray(int[] array){

        int min = entrada.getInt("Introduce rango inferior: ");
        int max = entrada.getInt("Introduce rango superior: ");

        for (int i = 0; i < array.length; i++){
            int n = 0;

            do {
                n = randomNumber(min,max);
            } while (!esPrimo(n));

            array[i] = n;
        }
    }
    public static void show(int[] array){
        for (int i : array)
            System.out.println(i);
    }

}
