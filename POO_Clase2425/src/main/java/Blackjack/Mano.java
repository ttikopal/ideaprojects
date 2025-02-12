package Blackjack;

import java.util.Arrays;

public class Mano {

    private Carta[] cartas;

    public Mano() {
        cartas = new Carta[0];
    }

    public void add(Carta carta){

        Carta[] aux = new Carta[cartas.length+1];
        int i = 0;
        aux[i++] = carta;

        for(Carta c : cartas){
            aux[i++] = c;
        }

        cartas = aux;
    }

    public int getPuntuacion(){
        return getPuntuacion(0,0);
    }

    public int getPuntuacion(int index, int puntuacion){

        if(puntuacion>21) return -1;
        if(index == cartas.length){
            return puntuacion;
        }
        Carta c = cartas[index];

        if(c.getPuntuaciones().length == 1)
            return getPuntuacion(index+1, puntuacion+c.getPuntuaciones()[0]);

        return Math.max(
            getPuntuacion(index+1, puntuacion + c.getPuntuaciones()[0]),
            getPuntuacion(index+1, puntuacion + c.getPuntuaciones()[1])
        );
    }

    @Override
    public String toString(){

        return "Puntuacion: " + getPuntuacion() + "\n" + Arrays.toString(cartas);
    }

}
