package es.ieslavereda.Bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carton {

    private List<Celda> celdas;

    public Carton() {
        celdas = new ArrayList<>();
        rellenar(10,1,90);
    }

    public Carton(Integer cantidad, Integer min, Integer max){
        this();
        rellenar(cantidad, min, max);
    }

    private int aleatorio(Integer min, Integer max){
        return (int)(Math.random()*(max-min+1)+min);
    }

    public void rellenar(Integer cantidad, Integer min, Integer max){

        Celda c;
        for(int i = 0; i< cantidad; i++){

            do{
                c = new Celda(aleatorio(min, max));
            }while(celdas.contains(c));

            celdas.add(c);
        }

        Collections.sort(celdas);
    }

    public boolean hayBingo(){
        boolean bingo = false;

        int i = 0;
        do{
            bingo = celdas.get(i).isMarcada();
            i++;
        }while(bingo && i < celdas.size());

        return bingo;

//        boolean completo = true;
//        for(Celda c : celdas){
//            completo = c.isMarcada() && completo;
//        }
//
//        return completo;
    }


    @Override
    public String toString() {
        return "Carton{" + celdas +
                '}';
    }

    public void check(Bola bola){

        for(Celda c: celdas){
            c.marcar(bola);
        }
    }
}
