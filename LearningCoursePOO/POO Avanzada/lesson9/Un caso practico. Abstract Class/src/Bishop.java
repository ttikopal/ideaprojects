public class Bishop extends Piece {
    public Bishop(Board board, Coordinate position, Bishop.Type type) {
        super(type.getType(), board.getCellAt(position));
    }

    //put your task here

    public enum Type {
        BLACK(Piece.Type.BLACK_BISHOP), WHITE(Piece.Type.WHITE_BISHOP);
        private Piece.Type type;

        Type(Piece.Type type) {
            this.type = type;
        }

        public Piece.Type getType() {
            return type;
        }
    }
}
