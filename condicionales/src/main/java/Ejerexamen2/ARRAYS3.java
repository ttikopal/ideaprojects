package Ejerexamen2;

public class ARRAYS3 {
    public static void main(String[] args) {

        int[] array = new int[100];
        rellenarArray(array);
        System.out.println("La suma de los numeros es: " + sumaNumeros(array));
        System.out.println("La media de los numeros es: " + media(array));
    }

    public static int randomNumber(){

        return (int)(Math.random()*100);

    }

    public static void rellenarArray(int[] array){
        for (int i = 0; i< array.length;i++)
            array[i] = randomNumber();
    }

    public static int sumaNumeros(int[] array){
        int suma = 0;

        for (int i : array)
            suma += i;
        return suma;
    }

    public static int media(int[] array){

        int suma = sumaNumeros(array);

        int promedio = suma/100;

        return promedio;


    }

}
