package Ejercicios;

public class ejercicio5 {
    public static void main(String[] args) {

        int num = entrada.getInt();

        for (int i = 1; i <= num * num; i++) {
            if (num > 3) {
                if (i < 10) {
                    System.out.print("0" + i + " ");
                } else System.out.print(i + " ");
                if (i % num == 0) {
                    System.out.println();
                }
            } else System.out.print(i + " ");
            if (i % num == 0) {
                System.out.println();
            }
        }
    }
}
