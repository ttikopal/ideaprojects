package org.example.MaquinaDePesar;

public enum GrasaCorporal {
    GRASA_ESCASA("Grasa en valores preocupantemente bajos"),
    GRASA_ESENCIAL("Grasa esencial"),
    DEPORTISTAS("Grasa nivel deportista"),
    FITNESS("Grasa nivel fitness"),
    PROMEDIO("Grasa en promedio"),
    OBESOS("Grasa en nivel obeso");

    private String comentario;

    GrasaCorporal(String comentario){
        this.comentario = comentario;
    }

    @Override
    public String toString(){
        return comentario;
    }

}