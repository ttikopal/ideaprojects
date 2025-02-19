package Recursividad;

public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println(strCopies("catcowcat","cat",2));

    }

    public static boolean strCopies(String str, String sub, int n) {


        int indice = str.indexOf(sub);


        if (indice >= 0){

            //Si hemos encontrado un índice pero no me está pidiendo ninguno, devolvemos false
            if (n == 0) return false;

            //Si encuentro 1 sigo buscando en la posición del índice encontrado más uno porque es inclusivo
            //Resto 1 a "n" porque hemos encontrado uno y estoy buscando uno menos
            return strCopies(str.substring(indice + 1),sub,n-1);

        }

        //Si n es 0 no buscabamos ninguno, se cumple la condición y devuelve true
        //Si n es mayor que 0 estábamos buscando alguno pero no lo hemos encontrado, no se cumple y devuelve false

        return n == 0;

//        if (n == 0) {
//            return true;
//        } else {
//            return false;
//        }




    }
}
