package org.example.chess;

import java.util.Map;
import java.util.Scanner;

public class Game {

    private String jugador1;
    private String jugador2;
    private Board board;




    public Game() {
        board = new Board();
        board.placePieces();

    }

    public void gameStart(Board board){
        board.placePieces();

        jugador1 = entrada.getTexto("Nombre de jugador 1: ");
        jugador2 = entrada.getTexto("Nombre de jugador 2: ");



    }



    public Board getBoard() {
        return board;
    }



}
