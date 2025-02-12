package Blackjack;

public class Jugador {

    private Mano mano;
    private String nombre;

    public Jugador(String nombre){
        this.nombre = nombre;
        mano = new Mano();
    }

    public void recibir(Carta carta){
        mano.add(carta);
    }

    public int getPuntuacion(){
        return mano.getPuntuacion();
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString(){

        return mano.toString();
    }
}
