package org.example.chess;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Board b = new Board();

        Game g1 = new Game();

        Piece k1 = new King(g1.getBoard(), new Coordinate('d',8), King.Type.WHITE);
        Piece r = new Rook(g1.getBoard(), new Coordinate('d',3), Rook.Type.BLACK);

        g1.init();





    }
}
