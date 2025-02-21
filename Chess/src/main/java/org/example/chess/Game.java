package org.example.chess;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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

    public void init() {

        jugador1 = entrada.getTexto("Nombre de BLANCAS: ");
        jugador2 = entrada.getTexto("Nombre de NEGRAS: ");

        do {
            turnoBlancas();
            turnoNegras();
        } while (true);

    }

    private Coordinate recogerCoordenada() {
        char letra;
        char n;
        int num = 0;
        Coordinate c;
        String coordenada;
        do {
            coordenada = entrada.getTexto("Introduce una coordenada").toUpperCase();
            letra = (coordenada.charAt(0));
            if (coordenada.length() == 2) {
                n = coordenada.charAt(1);
                num = n - '0';
            }
        } while (coordenada.length() != 2 ||
                letra < 'A' || letra > 'H' ||
                num < 1 || num > 8);

        c = new Coordinate(letra, num);
        return c;
    }

    private void turnoBlancas() {
        Coordinate c;

        board.removeHighLight();
        System.out.println(board);
        if (checkWhite()) {
            System.out.println("ESTAS EN JAQUE");
        }
        System.out.println("Mueve " + jugador1 + " --> BLANCAS\n" +
                "Qué pieza quieres mover?");


        do {
            c = recogerCoordenada();
        } while (board.getCellAt(c).isEmpty()
                || board.getCellAt(c).getPiece().getType().getColor() == Piece.Color.BLACK);

        Set<Coordinate> mv = board.getCellAt(c).getPiece().getNextMovements();


        for (Coordinate co : mv) {
            board.getCellAt(co).highlight();
        }

        System.out.println(board);

        Coordinate move;

        do {
            move = recogerCoordenada();
        } while (!mv.contains(move));

        board.getCellAt(c).getPiece().moveTo(move);
        board.removeHighLight();
        System.out.println(board);
    }

    private void turnoNegras() {
        Coordinate c;

        board.removeHighLight();
        System.out.println(board.toStringBlack());
        if (checkBlack()) {
            System.out.println("ESTAS EN JAQUE");
        }
        System.out.println("Mueve " + jugador2 + " --> NEGRAS\n" +
                "Qué pieza quieres mover?");


        do {
            c = recogerCoordenada();
        } while (board.getCellAt(c).isEmpty()
                || board.getCellAt(c).getPiece().getType().getColor() == Piece.Color.WHITE);

        Set<Coordinate> mv = board.getCellAt(c).getPiece().getNextMovements();


        for (Coordinate co : mv) {
            board.getCellAt(co).highlight();
        }

        System.out.println(board.toStringBlack());

        Coordinate move;

        do {
            move = recogerCoordenada();
        } while (!mv.contains(move));

        board.getCellAt(c).getPiece().moveTo(move);
        board.removeHighLight();
        System.out.println(board);
    }

    public boolean checkWhite() {

        boolean check = false;

        for (Cell c : board.getCells().values()) {
            if (!c.isEmpty()) {
                if (c.getPiece().getColor() == Piece.Color.BLACK) {
                    for (Coordinate o : c.getPiece().getNextMovements()) {
                        if (o.equals(board.getKingWhite().getCoordinate())) {
                            check = true;
                        }
                    }
                }
            }
        }

        return check;
    }


    public boolean checkBlack() {

        boolean check = false;

        for (Cell c : board.getCells().values()) {
            if (!c.isEmpty()) {
                if (c.getPiece().getColor() == Piece.Color.WHITE) {
                    for (Coordinate o : c.getPiece().getNextMovements()) {
                        if (o.equals(board.getKingBlack().getCoordinate())) {
                            check = true;
                        }
                    }
                }
            }
        }

        return check;
    }

    public Board getBoard() {
        return board;
    }


}
