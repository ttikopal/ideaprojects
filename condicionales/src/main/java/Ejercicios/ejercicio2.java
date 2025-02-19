package Ejercicios;

public class ejercicio2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 0) System.out.print(i + " ");
            if (i % 2 == 0) {
                if (i != 0)
                    System.out.print("-" + i + " ");
            } else System.out.print(i + " ");
        }

    }
}
