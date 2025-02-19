package Arrays;

import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

public class EjerciciosARRAYS5 {
    public static void main(String[] args) {



        int longitud = (int)('Z' - 'A') + 1;
        char[] array = new char[longitud];

        rellenarArray(array);
        show(array);
        concatenar(array);

    }

    public static void rellenarArray(char[] array){

        char letra = 'A';

        for (int i = 0;i<array.length;i++){

            array[i] = letra++;
        }
    }
    public static void show(char[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void concatenar(char[] array){

      String cadena = "";
      int num = entrada.getInt("Introduce un numero: ");

      while (num >= 0 && num < array.length) {

          cadena += array[num];
          System.out.println(cadena);
          num = entrada.getInt("Introduce un numero: ");


      }
        System.out.println(cadena);

    }
}
