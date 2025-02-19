package Ej5;

public class Jugador {

    private boolean vivo;
    private String nombre;

    public Jugador(String nombre){
        vivo = true;
        this.nombre = nombre;
    }

    public boolean dispararse(Pistola pistola){
        pistola.girarTambor();
        if (vivo) pistola.disparar();
        if (pistola.disparar()) vivo = false;
        return true;
    }



}
