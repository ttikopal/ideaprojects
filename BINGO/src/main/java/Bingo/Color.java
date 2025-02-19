package Bingo;

import com.diogonunes.jcolor.Attribute;

public enum Color {


    ROJO(Attribute.RED_TEXT()),
    AZUL(Attribute.BLUE_TEXT()),
    AMARILLO(Attribute.YELLOW_TEXT()),
    VERDE(Attribute.GREEN_TEXT());


    private Attribute color;

    Color(Attribute color){
        this.color = color;
    }

    public Attribute getColor(){
        return color;
    }


}
