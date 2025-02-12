public class DeletedPieceManagerImp implements IDeletedPieceManager{

    MyList<Piece> pieces;

    public DeletedPieceManagerImp(){
        pieces = new MyList<>();
    }

    @Override
    public void addPiece(Piece p) {
        pieces.addHead(p);
    }

    @Override
    public Piece removeLast() {
        return pieces.remove(0);
    }

    @Override
    public int count(Piece.Type type) {
        int cantidad = 0;

        for (int i = 0; i < pieces.size(); i++) {

            if (pieces.get(i).getType().equals(type)){
                cantidad++;
            }
        }
        return cantidad;
    }
}