package Blackjack;



public class Main {
    public static void main(String[] args) {

      Jugador j1 = new Jugador("Manolo");
      Jugador j2 = new Jugador("Jose");

      Game game = new Game(j1, j2);

      game.start();


    }
}
