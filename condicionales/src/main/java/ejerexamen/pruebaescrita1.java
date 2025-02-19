package ejerexamen;

public class pruebaescrita1 {
    public static void main(String[] args) {

        System.out.println("introduce el numero de filas: ");

        int num = entrada.getInt();
        System.out.print(Piramide(num));
        System.out.println(piramideInvertida(num));

    }

    public static String Piramide(int num){
        String t = "";
        for (int i = 1, b = num-1;b>=0;i+=2,b--){
            for (int j = 0 ; j<b;j++){
                t += "  ";
            }
            for (int j=0 ; j<i;j++){
                t += "* ";
            }
            t += "\n";
        } return t;

    }

    public static String piramideInvertida(int num){

        String t = "";

        for (int i = num*2 -1, b = 0; b <= num; i-=2,b++){

            for (int j =0;j<b;j++){
                t += "  ";
            }
            for (int j=0; j<i; j++){
                t += "* ";
            }
            t += "\n";
        } return t;
    }
}
