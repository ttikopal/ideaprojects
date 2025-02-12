package Blackjack;

public enum Valor {

    AS("A", 1, 11),
    DOS("2", 2),
    TRES("3", 3),
    CUATRO("4", 4),
    CINCO("5", 5),
    SEIS("6", 6),
    SIETE("7", 7),
    OCHO("8", 8),
    NUEVE("9", 9),
    DIEZ("10", 10),
    J("J", 10),
    Q("Q", 10),
    K("K", 10);

    private String simbolo;
    private int[] puntuaciones;

    Valor(String simbolo, int... puntuacion){
        this.simbolo = simbolo;
        this.puntuaciones = puntuacion;
    }

    public int[] getPuntuaciones(){
        return puntuaciones;
    }

    @Override
    public String toString(){
        return simbolo;
    }

}
