package org.example.chess;

import com.diogonunes.jcolor.Attribute;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Board {

    private Map<Coordinate, Cell> cells;
    private  DeletedPieceManagerListImp deletedList;

    public Board() {
        deletedList = new DeletedPieceManagerListImp();
        cells = new HashMap<>();

        for (int row = 1; row <= 8; row++)
            for (char col = 'A'; col <= 'H'; col++)
                cells.put(new Coordinate(col, row), new Cell(this, new Coordinate(col, row)));
    }


    public void placePieces(){

// Peones blancos
        Pawn p0 = new Pawn(this, new Coordinate('A', 7), Pawn.Type.WHITE);
        Pawn p1 = new Pawn(this, new Coordinate('B', 7), Pawn.Type.WHITE);
        Pawn p2 = new Pawn(this, new Coordinate('C', 7), Pawn.Type.WHITE);
        Pawn p3 = new Pawn(this, new Coordinate('D', 7), Pawn.Type.WHITE);
        Pawn p4 = new Pawn(this, new Coordinate('E', 7), Pawn.Type.WHITE);
        Pawn p5 = new Pawn(this, new Coordinate('F', 7), Pawn.Type.WHITE);
        Pawn p6 = new Pawn(this, new Coordinate('G', 7), Pawn.Type.WHITE);
        Pawn p7 = new Pawn(this, new Coordinate('H', 7), Pawn.Type.WHITE);

// Torres blancas
        Rook r1 = new Rook(this, new Coordinate('A', 8), Rook.Type.WHITE);
        Rook r2 = new Rook(this, new Coordinate('H', 8), Rook.Type.WHITE);

// Caballos blancos
        Knight k1 = new Knight(this, new Coordinate('B', 8), Knight.Type.WHITE);
        Knight k2 = new Knight(this, new Coordinate('G', 8), Knight.Type.WHITE);

// Alfiles blancos
        Bishop b1 = new Bishop(this, new Coordinate('C', 8), Bishop.Type.WHITE);
        Bishop b2 = new Bishop(this, new Coordinate('F', 8), Bishop.Type.WHITE);

// Rey y Dama blancos
        Queen q1 = new Queen(this, new Coordinate('D', 8), Queen.Type.WHITE);
        King king1 = new King(this, new Coordinate('E', 8), King.Type.WHITE);

// Peones negros
        Pawn p8 = new Pawn(this, new Coordinate('A', 2), Pawn.Type.BLACK);
        Pawn p9 = new Pawn(this, new Coordinate('B', 2), Pawn.Type.BLACK);
        Pawn p10 = new Pawn(this, new Coordinate('C', 2), Pawn.Type.BLACK);
        Pawn p11 = new Pawn(this, new Coordinate('D', 2), Pawn.Type.BLACK);
        Pawn p12 = new Pawn(this, new Coordinate('E', 2), Pawn.Type.BLACK);
        Pawn p13 = new Pawn(this, new Coordinate('F', 2), Pawn.Type.BLACK);
        Pawn p14 = new Pawn(this, new Coordinate('G', 2), Pawn.Type.BLACK);
        Pawn p15 = new Pawn(this, new Coordinate('H', 2), Pawn.Type.BLACK);

// Torres negras
        Rook r3 = new Rook(this, new Coordinate('A', 1), Rook.Type.BLACK);
        Rook r4 = new Rook(this, new Coordinate('H', 1), Rook.Type.BLACK);

// Caballos negros
        Knight k3 = new Knight(this, new Coordinate('B', 1), Knight.Type.BLACK);
        Knight k4 = new Knight(this, new Coordinate('G', 1), Knight.Type.BLACK);

// Alfiles negros
        Bishop b3 = new Bishop(this, new Coordinate('C', 1), Bishop.Type.BLACK);
        Bishop b4 = new Bishop(this, new Coordinate('F', 1), Bishop.Type.BLACK);

// Rey y Dama negros
        Queen q2 = new Queen(this, new Coordinate('D', 1), Queen.Type.BLACK);
        King king2 = new King(this, new Coordinate('E', 1), King.Type.BLACK);

    }

    public boolean contains(Coordinate c) {
        return cells.containsKey(c);
    }

    public Cell getKingWhite(){

        Cell i = new Cell(this, new Coordinate('E', 8));
        for (Cell c : cells.values()){
            if (!c.isEmpty()){
                if (c.getPiece().getType().equals(Piece.Type.WHITE_KING)){
                    i = c;
                }
            }
        }
        return i;
    }


    public Cell getKingBlack(){
        Cell i = new Cell(this, new Coordinate('E', 8));
        for (Cell c : cells.values()){
            if (!c.isEmpty()){
                if (c.getPiece().getType().equals(Piece.Type.BLACK_KING)){
                    i = c;
                }
            }
        }
        return i;
    }

    public Cell getCellAt(Coordinate c) {
        return cells.get(c);
    }

    public void highLight(Collection<Coordinate> coordinates) {
        for (Coordinate c : coordinates)
            getCellAt(c).highlight();
    }

    public  DeletedPieceManagerListImp getDeletedList() {
        return deletedList;
    }


    public void removeHighLight() {
        cells.values().stream().forEach(cell -> cell.removeHighLight());
    }


    public Map<Coordinate, Cell> getCells() {
        return cells;
    }

    public int count(Piece.Type pieceType) {
        int i = 0;
        for(Cell c : cells.values()) {
            if (!c.isEmpty() && c.getPiece().getType() == pieceType)
                i++;
        }
        return i;
    }

    public String toStringBlack(){
        String aux = "    A  B  C  D  E  F  G  H\n";

        for (int row = 8; row >= 1; row--) {
            aux += " " + row + " ";
            for (char col = 'A'; col <= 'H'; col++)
                aux += cells.get(new Coordinate(col, row));

            aux += " " + row + "\n";
        }
        aux += "    A  B  C  D  E  F  G  H";
        return aux;
    }

    @Override
    public String toString() {
        String aux = "    A  B  C  D  E  F  G  H\n";

        for (int row = 1; row <= 8; row++) {
            aux += " " + row + " ";
            for (char col = 'A'; col <= 'H'; col++)
                aux += cells.get(new Coordinate(col, row));

            aux += " " + row + "\n";
        }
        aux += "    A  B  C  D  E  F  G  H";

        aux += "\n\n";

        return aux;
    }
}
