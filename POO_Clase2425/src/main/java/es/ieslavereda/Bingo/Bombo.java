package es.ieslavereda.Bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bombo {

    private List<Bola> bolas;

    public Bombo() {
        bolas = new ArrayList<>();
    }

    public boolean isEmpty(){
        return bolas.isEmpty();
    }

    public void rellenar(){
        for(int i = 1; i<=90; i++){
            bolas.add(new Bola(i));
        }
    }

    public void girar(){
        Collections.shuffle(bolas);

    }

    public boolean contains(Bola bola){
        return bolas.contains(bola);

    }

    public Bola sacarBola(){

        if(bolas.size()%5==0) girar();
        if(!bolas.isEmpty()) return bolas.remove(0);

        return null;
    }

    @Override
    public String toString() {
        return "Bombo{" +
                "bolas=" + bolas +
                '}';
    }
}
