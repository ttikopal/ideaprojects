package org.example.chess;

import java.util.Map;
import java.util.Scanner;

public class Game {

    private String jugador1;
    private String jugador2;
    private Board board;
    private Screen sc;




    public Game() {
        board = new Board();
        board.placePieces();
        sc = new Screen(board);

    }

    public void init(){
        board.placePieces();

        jugador1 = entrada.getTexto("Nombre de BLANCAS: ");
        jugador2 = entrada.getTexto("Nombre de NEGRAS: ");

        turnoBlancas();


    }

    private Coordinate recogerCoordenada(){
        char letra;
        char n;
        int num;
        Coordinate c;
        String coordenada = "";
        do {
            coordenada = entrada.getTexto("Introduce una coordenada").toUpperCase();
            letra = (coordenada.charAt(0));
            n = coordenada.charAt(1);
            num = n-'0';

        } while (coordenada.length() != 2 ||
                letra < 'A' || letra > 'H' ||
                n < '1' || n > '8' );

        c = new Coordinate(letra,num);
        return c;
    }

    private void turnoBlancas(){
        Coordinate c;
        do {
            System.out.println("Mueve " + jugador1 + " --> BLANCAS\n"+
                    "Qué pieza quieres mover?");
            sc.showTotal();
            c = recogerCoordenada();
        } while (board.getCellAt(c).isEmpty() || board.getCellAt(c).getPiece().getType().getColor() == Piece.Color.BLACK);


        System.out.println(board.getCellAt(c).getPiece().getNextMovements());


    }



    public Board getBoard() {
        return board;
    }



}
