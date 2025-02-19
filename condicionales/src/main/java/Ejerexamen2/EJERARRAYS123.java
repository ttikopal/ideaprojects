package Ejerexamen2;

public class EJERARRAYS123 {
    public static void main(String[] args) {


        String[][] array = new String[entrada.getInt("Introduce las filas del array")][entrada.getInt("Introduce las columnas del array")];
        rellenarArray(array);
        show(array);
        System.out.println("La suma es: "+suma(array));
        System.out.println("La media es " + media(array));
    }

    public static void rellenarArray(String[][] array){

        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                array[i][j] = "" + i+j +" ";
            }
        }
    }

    public static void show(String[][] array){

        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }

    public static int suma(String[][] array){

        int suma = 0;

        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                suma += Integer.parseInt(array[i][j].trim());
            }
        }
        return suma;

    }

    public static double media(String[][] array){
        return (double) suma(array)/(array.length + array[0].length);
    }

}
