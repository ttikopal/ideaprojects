package org.example.chess;

public class Main {
    public static void main(String[] args) {

        Game g = new Game();
        Screen sc = new Screen(g.getBoard());


        sc.showTotal();
        g.getBoard().getCellAt(new Coordinate('B',1)).getPiece().remove();



        sc.showTotal();


    }
}
