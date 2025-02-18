package org.example.chess;

import com.diogonunes.jcolor.Attribute;

import java.util.ArrayList;
import java.util.List;

import static com.diogonunes.jcolor.Ansi.colorize;

public class DeletedPieceManagerListImp implements IDeletedPieceManager{

    List<Piece> pieceList;


    public DeletedPieceManagerListImp() {
        pieceList = new ArrayList<>();
    }


    @Override
    public String toString() {
        String aux = "";

        aux += "\t\tDELETED PIECES\n";

        for(Piece.Type p : Piece.Type.values()){
            aux += colorize(" ",Attribute.BACK_COLOR(100,100,100))+colorize(p.getShape(),p.getColor().getAttribute(),Attribute.BACK_COLOR(100,100,100))+colorize(" ",Attribute.BACK_COLOR(100,100,100));
        }
        aux += "\n";
        for(Piece.Type p : Piece.Type.values()){
            aux += colorize(" ",Attribute.BACK_COLOR(180,180,180))+colorize(""+count(p),Attribute.TEXT_COLOR(100,100,100),Attribute.BACK_COLOR(180,180,180))+colorize(" ",Attribute.BACK_COLOR(180,180,180));
        }

        return aux;

    }

    @Override
    public void addPiece(Piece piece) {
        pieceList.add(piece);
    }

    @Override
    public Piece removeLast() {
        return pieceList.remove(pieceList.size()-1);
    }

    @Override
    public int count(Piece.Type pieceType) {
        int i = 0;
        for(Piece p : pieceList) {
            if (p.getType() == pieceType)
                i++;
        }
        return i;
    }
}
