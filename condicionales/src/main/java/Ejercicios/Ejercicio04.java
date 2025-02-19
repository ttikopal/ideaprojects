import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine();

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