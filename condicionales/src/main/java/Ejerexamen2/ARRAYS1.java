package Ejerexamen2;

public class ARRAYS1 {
    public static void main(String[] args) {

        //Crea un array de 10 números, los valores se ingresarán por teclado.
        // Luego, muestra por consola el índice y el valor de todos los elementos.
        // Debes realizar dos métodos, uno para rellenar los valores de los elementos y otro para mostrarlos.

        int[] array = new int[10];
        rellenarArray(array);
        mostrarArray(array);
    }

    public static void rellenarArray(int[] array){

        for (int i = 0; i< array.length;i++){
            array[i] = entrada.getInt("Introduce el valor de la posicion " + i);
        }
    }


    public static void mostrarArray(int[] array){

        for (int i = 0; i < array.length;i++){
            System.out.println("Posición " + i + "-------> " + array[i]);
        }

    }
}
