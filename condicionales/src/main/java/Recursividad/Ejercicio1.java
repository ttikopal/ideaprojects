package Recursividad;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println(irreal(1284));

    }

    public static boolean irreal(int numero) {

        if (numero < 10) return true;

        if (numero%10 < (numero/10)%10) return false;

        return irreal(numero/10);

    }

}


