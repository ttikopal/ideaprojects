package Blackjack;

public class Carta {

    private Valor valor;
    private Palo palo;

    public Carta(Valor valor, Palo palo){

        this.valor = valor;
        this.palo = palo;

    }

    public int[] getPuntuaciones(){
        return valor.getPuntuaciones();
    }

    @Override
    public String toString(){
        return "" + valor + palo;
    }
}
