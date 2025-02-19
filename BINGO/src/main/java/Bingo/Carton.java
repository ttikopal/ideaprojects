package Bingo;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Carton {

    private int[] numeros;
    private Bombo bombo;

    public Carton(int cantidad, Bombo bombo){
        numeros = new int[10];
        for (int i = 0; i< numeros.length;i++){
            numeros[i] = (int)(Math.random()* cantidad + 1);
        }
        this.bombo = bombo;
    }

//    public boolean revisarNumero(){
//
//        boolean si = false;
//       // int[] aux = new int[numeros.length-1];
//
//        for (int i = 0; i<numeros.length;i++){
//            if (bombo.getBola().getNumero() == numeros[i]){
//                numeros[i] = 0;
//                si = true;
//            }
//        }
//        return si;
//    }

    public int[] getNumeros(){
        return numeros;
    }

    public void marcarNumero(int numeroBola) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBola) {
                numeros[i] = 0; // Marca el número
            }
        }
    }
    @Override
    public String toString() {
        return Arrays.toString(numeros);
    }
}
