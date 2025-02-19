package Ejerexamen2;

public class compare {

    public static void main(String[] args) {

        System.out.println(compare("abc","abd"));

    }

    public static int compare(String texto, String texto2){

        texto = texto.toLowerCase();
        texto2 = texto2.toLowerCase();

        if (texto.equals(texto2)) return 0;
        if (texto.length() > texto2.length()) return -1;

        return compare(texto.substring(1),texto2.substring(1));
    }

}
