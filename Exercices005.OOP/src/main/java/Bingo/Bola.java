package Bingo;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Bola {

    private Color color;
    private int numero;

    public Bola(Color color, int numero){
        this.color = color;
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }


    @Override
    public String toString() {
        return colorize(String.valueOf(numero),color.getColor());
    }
}
