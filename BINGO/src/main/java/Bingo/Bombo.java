package Bingo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Bombo {

    private Bola[] bolas;
    private static int giros = 0;
    private int tamano;
    private Carton[] carton;

    public Bombo(Color color, int tamano,Carton... carton){
        this.tamano = tamano;
        bolas = new Bola[tamano];

        for (int i = 0; i < bolas.length;i++){
            bolas[i] = new Bola(color, i+1);
        }
        girarBombo();
        this.carton = carton;
    }

    public Bola getBola(){
        if (bolas.length == 0) {
            throw new IllegalStateException("No hay más bolas en el bombo.");
        }
        return bolas[0];
    }

    public void sacarBola(){

        if (bolas.length == 0){
            System.out.println("No quedan más bolas para sacar.");
            return;
        }

        Bola[] aux;
        giros++;
        aux = new Bola[bolas.length-1];
        System.out.println(bolas[0]);
        for (int i = 0; i< bolas.length-1;i++){
            aux[i] = bolas[i+1];
        }
        bolas = aux;
        if (giros == 5){
            girarBombo();
            giros = 0;
        }
    }


    public boolean quedanBolas(){
        if (bolas.length>0) return true;
        return false;
    }

    private void girarBombo(){
        List<Bola> bolasList = Arrays.asList(bolas);
        Collections.shuffle(bolasList);

        int i=0;
        for (Bola c : bolasList)
            bolas[i++]=c;
    }


    public int getTamano(){
        return tamano;
    }

    @Override
    public String toString() {
        return Arrays.toString(bolas);
    }
}
