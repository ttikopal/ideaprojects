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
            if (checkWhite()){
                turnoBlancas();
                if (!checkWhite()) {
                    turnoNegras();
                }
            }
        } while (!checkMateWhite() && !checkMateBlack());
        if (checkMateBlack()){
            System.out.println("Ha ganado " + jugador1);
        } else {
            System.out.println("Ha ganado " + jugador2);
        }
    }

    private Coordinate recogerCoordenada() {
        char letra = 0;
        int num = 0;
        Coordinate c;
        String coordenada;

        do {
            coordenada = entrada.getTexto("Introduce una coordenada").toUpperCase();

            if (!coordenada.isEmpty()) {
                letra = (coordenada.charAt(0));
                if (coordenada.length() == 2) {
                    char n = coordenada.charAt(1);
                    num = n - '0';
                }
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
        sc.showTableroBlancas();
        if (checkWhite()) {
            System.out.println("ESTAS EN JAQUE");
        }
        System.out.println("Mueve " + jugador1 + " --> BLANCAS\n" +
                "Qué pieza quieres mover?");


        do {
            c = recogerCoordenada();
        } while (board.getCellAt(c).isEmpty()
                || board.getCellAt(c).getPiece().getType().getColor() == Piece.Color.BLACK
                || !board.getCellAt(c).getPiece().canMove());

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
    }

    private void turnoNegras() {
        Coordinate c;

        board.removeHighLight();
        sc.showTableroNegras();
        if (checkBlack()) {
            System.out.println("ESTAS EN JAQUE");
        }
        System.out.println("Mueve " + jugador2 + " --> NEGRAS\n" +
                "Qué pieza quieres mover?");


        do {
            c = recogerCoordenada();
        } while (board.getCellAt(c).isEmpty()
                || board.getCellAt(c).getPiece().getType().getColor() == Piece.Color.WHITE
                || !board.getCellAt(c).getPiece().canMove());

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
    }

    private boolean checkWhite() {

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

    private boolean checkBlack() {

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

    private boolean winWhite(){
        return board.getDeletedList().contains(Piece.Type.BLACK_KING);
    }

    private boolean winBlack(){
        return board.getDeletedList().contains(Piece.Type.WHITE_KING);
    }

    private boolean checkMateWhite(){
       return checkWhite();
    }

    private boolean checkMateBlack(){
        return checkBlack();
    }

    public Board getBoard() {
        return board;
    }
}
