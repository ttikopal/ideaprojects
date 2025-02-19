package ejerexamen;

public class ejerexamen7 {
    public static void main(String[] args) {

        System.out.println("Introduce una frase: ");
        String frase = entrada.getTexto();
        System.out.println("Introduce una palabra: ");
        String f = entrada.getTexto();
        System.out.println("Introduce la segunda palabra: ");
        String s = entrada.getTexto();

        System.out.println(Frase(frase,f,s));

    }


    public static String Frase(String frase, String f, String s){


        String resultado = "";
        frase = frase.toLowerCase();
        f = f.toLowerCase();

        for (int i = 0; i < frase.length()-1;i++){

            if (frase.charAt(i) == f.charAt(0)){
                resultado += frase.charAt(i)    ;
            }

        }

        return resultado;
    }
}
