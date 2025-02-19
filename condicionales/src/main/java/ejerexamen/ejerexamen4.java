package ejerexamen;

//(Alta dificultad) Dado un texto entrado por el usuario por consola, quita todas las letras duplicadas excepto la doble r "rr" y la doble l "ll".
//Por ejemplo, "llamaa pppor teléfonnno aaal   perroo"
//debería ser transformado a "llama por teléfono al perro". Ten en cuenta los dobles espacios también.



public class ejerexamen4 {
    public static void main(String[] args) {


        String texto = "llamaa pppor teléfonnno aaall   perroo";

        String res = "";

        for (int i = 0; i < texto.length()-1;i++){
            if (texto.charAt(i) == 'l' && texto.charAt(i+1) == 'l') {
                res += texto.charAt(i);
            }
            if (texto.charAt(i) == 'r' && texto.charAt(i+1) == 'r'){
                res += texto.charAt(i);
            }
            if (texto.charAt(i) != texto.charAt(i+1)){
                res += texto.charAt(i);
            }
        }
        res += texto.charAt(texto.length()-1);
        System.out.println(res);
    }
}
