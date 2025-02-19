package Arrays;

public class EjerciciosARRAYS7 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        rellenarArray(numeros);
        detectarNumeros(numeros);
        calcularMediapos(numeros);
        calcularMedianeg(numeros);

    }

    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.getInt("Introduce un número: ");
        }
    }

    public static void detectarNumeros(int[] array) {

        int ceros = 0;
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                ceros++;
            } else if (array[i] > 0) {
                positivos++;
            } else negativos++;

        }
        System.out.println("Hay " + ceros + " números con el valor de 0, " + positivos + " números positivos y, " + negativos + " números negativos.");
    }

    public static void calcularMediapos(int[] array) {
        int n = 0;
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                n += array[i];
                cont++;
            }
        }
        int media = n / cont;
        System.out.println("La media de los números positivos es de: " + media);
    }

    public static void calcularMedianeg(int[] array) {
        int n = 0;
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                n += array[i];
                cont++;
            }
        }
        int media = n / cont;
        System.out.println("La media de los números negativos es de: " + media);
    }
}
