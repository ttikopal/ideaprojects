package Ejerexamen2;

public class ejercicio4 {
    public static void main(String[] args) {

        System.out.println(strCopies("catcowcat", "cat", 2)); // → true
        System.out.println(strCopies("catcowcat", "cow", 2)); // → false
        System.out.println(strCopies("catcowcat", "cow", 1)); // → true

    }

    public static boolean strCopies(String str, String str2, int num) {

       int indice = str.indexOf(str2);

       if (indice >= 0){

           if (num == 0){
               return false;
           } return strCopies(str.substring(str.indexOf(str2) + 1),str2,num -1);


       } return num == 0;


    }
}
