package Ejercicios;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Manolo Garcia Lopez",500);
        Cuenta cuenta2 = new Cuenta("Adrian Santos Gracia");
        cuenta1.Ingreso(500);
        cuenta1.Transferencia(700,cuenta2);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
