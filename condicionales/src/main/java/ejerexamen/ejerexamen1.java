package ejerexamen;

public class ejerexamen1 {
    public static void main(String[] args) {


        int num = 5;


        for (int i = 0; i < num; i++){

            for (int j = 0; j<num;j++){

                if (j + i == num-1 || i == j){
                     System.out.print(i + 1 + " ");
                } else System.out.print(0  + " ");
            }
            System.out.println();
        }

    }
}
