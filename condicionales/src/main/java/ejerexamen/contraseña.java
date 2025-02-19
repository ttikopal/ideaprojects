package ejerexamen;


public class contraseña {
    public static void main(String[] args) {


        System.out.println(Contraseña(3));

    }



    public static String Contraseña(int num){

        char a = 'a';
        char am = 'A';
        char n = '0';

        String aux = "";
        String contraseña = "";
        for (int i = 0; i<=25; i++){
            aux += (char)(a+i);
            aux += (char)(am + i);
        }
        for (int i = 0; i<=9;i++){
            aux += (char)(n+i);
        }

        contraseña += aux.charAt((int)Math.random()*num);

        return contraseña;
    }
}
