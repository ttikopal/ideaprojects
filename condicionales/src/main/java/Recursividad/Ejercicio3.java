package Recursividad;



//pairStar("hello") → "hel*lo"
//pairStar("xxyy") → "x*xy*y"
//pairStar("aaaa") → "a*a*a*a"



public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println(pairStar("xxyy"));

    }

    public static String pairStar(String str) {

        if (str.length() < 2) return str;

        if (str.charAt(0) == str.charAt(1)) return str.charAt(0) + "*" + pairStar(str.substring(1));

        return str.charAt(0) + pairStar(str.substring(1));

    }

}
