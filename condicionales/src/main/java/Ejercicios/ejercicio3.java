package Ejercicios;


public class ejercicio3 {
    public static void main(String[] args) {


        int aux = 97;

        int num = (int) Math.floor(Math.random() * 25);

        int numrandom = aux + num;

        switch (numrandom) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal, es la letra: " + (char) numrandom);
                break;
            default:
                System.out.println("Es consonante, es la letra: " + (char) numrandom);
        }


    }
}
