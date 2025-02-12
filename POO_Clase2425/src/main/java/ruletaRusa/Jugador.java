package ruletaRusa;

public class Jugador {

    private boolean vivo;
    private String nombre;

    public Jugador(String nombre){
        this.nombre = nombre;
        vivo = true;
    }

    public boolean isAlive(){
        return vivo;
    }

    public void disparar(Pistola pistola){

        if(vivo) {
            pistola.girarTambor();
            boolean tiro = pistola.disparar();
            if(tiro){
                vivo = false;
            }
        }

    }

    public String getNombre(){
        return nombre;
    }


}
