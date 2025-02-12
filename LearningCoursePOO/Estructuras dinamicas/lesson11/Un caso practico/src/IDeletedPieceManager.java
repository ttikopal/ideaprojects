public interface IDeletedPieceManager {

    void addPiece(Piece p);
    Piece removeLast();
    int count (Piece.Type type);
}
