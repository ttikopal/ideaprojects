package ejerexamen;

public class palindromo {
    public static void main(String[] args) {

        String texto = entrada.getTexto();

        String sinespacios = "";

        for (int i = 0; i <= texto.length()-1;i++){
            if (texto.charAt(i) != ' '){
                sinespacios += texto.charAt(i);
            }
        }
        System.out.println(sinespacios);

        String aux = "";
        String aux2 = "";

        for (int i = sinespacios.length()-1; i >= sinespacios.length()/2;i--){
            aux += sinespacios.charAt(i);
        }


        for (int i = 0; i < sinespacios.length()/2;i++){
            aux2 += sinespacios.charAt(i);
        }



        if (aux.equals(aux2)){
            System.out.println("La frase es palíndroma");
        } else System.out.println("La frase no lo es");
    }
}
