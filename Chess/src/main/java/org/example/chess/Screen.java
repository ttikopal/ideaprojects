package org.example.chess;

import com.diogonunes.jcolor.Attribute;

import java.awt.*;
import java.util.List;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Screen {

    private Board board;


    public Screen(Board board){
        this.board = board;

    }

    public Board getBoard() {
        return board;
    }

    public void showTableroBlancas(){
        System.out.println(board);
        showTotal();

    }



    public void showTableroNegras(){
        System.out.println(board.toStringBlack());
        showTotal();

    }

    public void showTotal(){
        String aux = "";

        System.out.println("\t\tREMAINING PIECES");

        for(Piece.Type p : Piece.Type.values()){
            aux += colorize(" ",Attribute.BACK_COLOR(100,100,100))+colorize(p.getShape(),p.getColor().getAttribute(),Attribute.BACK_COLOR(100,100,100))+colorize(" ",Attribute.BACK_COLOR(100,100,100));
        }
        aux += "\n";
        for(Piece.Type p : Piece.Type.values()){
            aux += colorize(" ",Attribute.BACK_COLOR(180,180,180))+colorize(""+board.count(p),Attribute.TEXT_COLOR(100,100,100),Attribute.BACK_COLOR(180,180,180))+colorize(" ",Attribute.BACK_COLOR(180,180,180));
        }
        aux += "\n";
        System.out.println(aux);
        System.out.println(board.getDeletedList());
        System.out.println();
        System.out.println();
    }

}
