package ejerexamen;

public class ejerexamen5 {
    public static void main(String[] args) {

        System.out.println("Introduce un numero: ");

        int num = entrada.getInt();

        for (int i=1; i<=num*num;i++){
            if (i > 9){
                System.out.print(i + " ");
            } else if (num <= 3){
                System.out.print(i + " ");
            } else System.out.print("0"+i + " ");
            if (i%num == 0){
                System.out.println();
            }
        }
    }
}
