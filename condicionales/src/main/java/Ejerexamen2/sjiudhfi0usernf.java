package Ejerexamen2;

public class sjiudhfi0usernf {
    public static void main(String[] args) {

        System.out.println(binary(1233));


    }

    public static String binary(int n){

        if (n == 0) return "";

        return binary(n/2) + (n%2) ;

    }
}
