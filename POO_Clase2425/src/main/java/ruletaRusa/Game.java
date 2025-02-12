package ruletaRusa;

public class Game {

    private Pistola pistola;
    private Jugador jugador0;
    private Jugador jugador1;
    private int turno;


    public Game(Jugador jugador0, Jugador jugador1){
        this.jugador0 = jugador0;
        this.jugador1 = jugador1;
        pistola = new Pistola();
        turno = (int)(Math.random()*2);

    }

    public Jugador start(){

        pistola.recargar(new Bala());

        while(jugador0.isAlive() && jugador1.isAlive()) {

            switch (turno) {
                case 0:
                    jugador0.disparar(pistola);
                    break;
                case 1:
                    jugador1.disparar(pistola);
                    break;

            }

            turno = (turno+1)%2; //para que vaya alternando entre 0 y 1
        }

        return (jugador0.isAlive())?jugador0:jugador1; // si el jugador0 está vivo, devuelve el jugador0, sino devuelve el jugador1
    }


}
