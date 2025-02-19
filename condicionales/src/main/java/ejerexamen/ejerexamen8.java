package ejerexamen;

public class ejerexamen8 {
    public static void main(String[] args) {

        System.out.println(Equals("hola","hola"));

        System.out.println(Equals("hooola","hola"));
        System.out.println(Equals("hooola","hola1"));
        System.out.println(Equals("hooola","hooola"));
        System.out.println(Equals("hooola","holaaaa"));

    }

    public static boolean Equals(String text1, String text2){

        boolean si = true;

        for (int i = 0; si && i<text1.length();i++){
            si = text1.charAt(i) == text2.charAt(i);
        }
        return si;
    }
}
