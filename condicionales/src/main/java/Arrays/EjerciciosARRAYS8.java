package Arrays;

import java.util.Arrays;

public class EjerciciosARRAYS8 {
    public static void main(String[] args) {


        int n = pedirPersonas();
        int[] personas = new int[n];
        double[] altura = new double[n];
        pedirAltura(altura);
        mostrarPersonasAltura(altura);
        System.out.println("La altura media es de: " + calcularMedia(altura));
        calcularDiferencias(altura);
    }

    public static int pedirPersonas() {

        int n;
        n = entrada.getInt("Introduce el numero de personas: ");

        if (n <= 0) {
            do {
                n = entrada.getInt("Tiene que ser superior a 0: ");
            } while (n <= 0);
        }
        return n;
    }

    public static void pedirAltura(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.getDouble("Introduce la altura de la persona " + (i + 1));
        }
    }

    public static void mostrarPersonasAltura(double[] altura) {
        for (int i = 0; i < altura.length; i++) {
            System.out.println("La altura de la persona " + (i + 1) + " es de: " + altura[i]);
        }
    }

    public static double calcularMedia(double[] altura) {
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < altura.length; i++) {
            suma += altura[i];
            contador++;
        }
        return (suma / contador);
    }

    public static void calcularDiferencias(double[] array) {

        int bajo = 0;
        int alto = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < calcularMedia(array)) {
                bajo++;
            } else alto++;
        }

        System.out.println("El número de personas por debajo de la media es de: " + bajo + ", y el número por encima es de: " + alto);
    }
}
