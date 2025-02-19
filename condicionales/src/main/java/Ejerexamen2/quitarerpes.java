package Ejerexamen2;

public class quitarerpes {

    public static void main(String[] args) {

        String texto = "Hooooolaaaaaaa";
        String textobien = "";
        for (int i = 0; i < texto.length()-1;i++){
            if (texto.charAt(i) != texto.charAt(i+1)){
                textobien += texto.charAt(i);
            }
        }
        textobien += texto.charAt(texto.length()-1);

        System.out.println(textobien);


    }
}
