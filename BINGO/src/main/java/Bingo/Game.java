package Bingo;

public class Game {


    private Carton carton;
    private Bombo bombo;
    private Jugador[] jugadores;

    public Game(Bombo bombo, Jugador... jugadores){
        this.bombo = bombo;
        this.jugadores = jugadores;
    }

    public void start() {
        // Sacar una bola del bombo
        int numeroBola = bombo.getBola().getNumero(); // Obtén el número de la bola

        // Llamar al metodo revisarNumero() para revisar los cartones
        for (int i = 0; i < jugadores.length; i++) {
            Jugador jugador = jugadores[i]; // Obtener el jugador actual
            boolean encontrado = false;

            // Revisar los cartones de todos los jugadores
            for (int j = 0; j < jugador.getCarton().getNumeros().length; j++) {
                if (revisarNumero(jugador.getCarton(), numeroBola)) {
                    encontrado = true;
                    break;
                }
            }

            // Si el jugador tiene el número en su cartón
            if (encontrado) {
                System.out.println(jugador.getNombre() + " tiene la bola " + numeroBola + " en su cartón.");
            }
        }
    }

    private boolean revisarNumero(Carton carton, int numeroBola) {

            boolean encontrado = false;

            for (int num : carton.getNumeros()) {
                if (num == numeroBola) {
                    carton.marcarNumero(bombo.getBola().getNumero()); // Marca el número en el cartón
                    encontrado = true;
                    break;
                }
            }
            return encontrado;
    }


}
