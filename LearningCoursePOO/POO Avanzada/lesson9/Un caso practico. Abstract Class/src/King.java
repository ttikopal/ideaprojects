public class King extends Piece{
    public King(Board board, Coordinate position, King.Type type) {
        super(type.getType(), board.getCellAt(position));
    }

    //put your task here

    public enum Type {
        BLACK(Piece.Type.BLACK_KING), WHITE(Piece.Type.WHITE_KING);
        private Piece.Type type;

        Type(Piece.Type type) {
            this.type = type;
        }

        public Piece.Type getType() {
            return type;
        }
    }
}
