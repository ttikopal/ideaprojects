public interface MoveAsBishop {


    default Coordinate[] getMovementsAsBishop(Piece p){

        Coordinate[] nextMovements = new Coordinate[0];

        Board board = p.getCell().getBoard();
        Coordinate myPosition = p.getCell().getCoordinate();
        Coordinate c;


        do {
            c = myPosition.up().right();

            if (p.canAddToNextMovements(c)){
                nextMovements = Tool.add(c,nextMovements);
            }
        } while (board.contains(c) && board.getCellAt(c).isEmpty());


        do {
            c = myPosition.up().left();

            if (p.canAddToNextMovements(c)){
                nextMovements = Tool.add(c,nextMovements);
            }
        } while (board.contains(c) && board.getCellAt(c).isEmpty());


        do {
            c = myPosition.down().right();

            if (p.canAddToNextMovements(c)){
                nextMovements = Tool.add(c,nextMovements);
            }
        } while (board.contains(c) && board.getCellAt(c).isEmpty());


        do {
            c = myPosition.down().left();

            if (p.canAddToNextMovements(c)){
                nextMovements = Tool.add(c,nextMovements);
            }
        } while (board.contains(c) && board.getCellAt(c).isEmpty());



        return nextMovements;

    }
}
