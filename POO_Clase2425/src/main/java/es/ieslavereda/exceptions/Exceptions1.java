package es.ieslavereda.exceptions;

public class Exceptions1 {
    public static void main(String[] args) throws Exception{


        int i = 4;
        int j = 0;
        //System.out.println(i/j);

        String numero ="45";

        try {
            System.out.println(parsearNumero(numero));
        } catch (Exception e) {
            System.out.println("Capturada la excepción:" + e);
        }

//
//        try {
//            System.out.println(Integer.parseInt(numero));
//        } catch (Exception e){
//            System.out.println("No puedo transformar " + numero +
//                    " en entero");
//        }



    }

    private static int parsearNumero(String numero) throws Exception {

       if (numero.equals("casa"))
           throw new Exception("No puedo transformar el " + numero);

       return Integer.parseInt(numero);
    }
}
