package Blackjack;

public class Game {

    private Jugador[] jugadores;
    private Jugador pc;
    private Baraja baraja;

    public Game(Jugador... jugadores){
        this.jugadores = jugadores;
        pc = new Jugador("Banca");
        baraja = new Baraja();
    }

    public void start(){

        jueganJugadores();
        juegaBanca();
        analizoGanador();

    }

    private void jueganJugadores() {

        for(Jugador jugador: jugadores) {
            baraja = new Baraja();
            baraja.barajar();
            char opcion = ' ';

            System.out.println("Juega " + jugador.getNombre());

            do {

                jugador.recibir(baraja.obtenerCartaSuperior());
                System.out.println(jugador);
                opcion = Entrada.getOpcion("Quieres carta " + jugador.getNombre() + "?");


            }while(jugador.getPuntuacion() < 21 && opcion == 's');

        }

    }

    private void juegaBanca() {
        baraja = new Baraja();
        baraja.barajar();
        char opcion= ' ';

        do{

            pc.recibir(baraja.obtenerCartaSuperior());
            System.out.println(pc);

            if(pc.getPuntuacion()<21) {
                opcion = obtenerOpcionBanca();
                System.out.println(opcion);
            }


        }while(pc.getPuntuacion() < 21 && opcion == 's');

    }

    public char obtenerOpcionBanca(){
        int puntuacion = 0;

        for(Jugador jugador: jugadores){
            if(jugador.getPuntuacion() > puntuacion && jugador.getPuntuacion()<= 21){
                puntuacion = jugador.getPuntuacion();
            }

        }
        return (pc.getPuntuacion()<puntuacion)?'s':'n';
    }



    private void analizoGanador() {

        if(pc.getPuntuacion() <= 21) {
            System.out.println("Gana la Banca!!");
        }else{

            for(Jugador j : jugadores){
                if(j.getPuntuacion()<= 21){
                    System.out.println(j.getNombre() + " gana");
                }
            }
        }

    }


}
