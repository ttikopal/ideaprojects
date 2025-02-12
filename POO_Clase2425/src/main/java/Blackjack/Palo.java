package Blackjack;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public enum Palo {

    CORAZON('♥', Attribute.RED_TEXT()),
    PICAS('♠', Attribute.BLACK_TEXT()),
    TREBOL('♣', Attribute.BLACK_TEXT()),
    ROMBO('♦', Attribute.RED_TEXT());

    private char forma;
    private Attribute color;

    Palo(char forma, Attribute color){
        this.forma = forma;
        this.color = color;
    }

    @Override
    public String toString(){
        return colorize(String.valueOf(forma), color);
    }

}
