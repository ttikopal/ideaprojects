public interface MoveAsRook {


    default Coordinate[] getMovementsAsRook(Piece p){



        Coordinate[] nextMovements = new Coordinate[0];
        Board board = p.getCell().getBoard();
        Coordinate myPosition = p.getCell().getCoordinate();
        Coordinate c;

        do {
            c = myPosition.up();
            if (p.canAddToNextMovements(c)){
                nextMovements = Tool.add(c,nextMovements);
            }
        } while (board.contains(c) && board.getCellAt(c).isEmpty());


        do {
            c = myPosition.down();
            if (p.canAddToNextMovements(c)){
                nextMovements = Tool.add(c,nextMovements);
            }
        } while (board.contains(c) && board.getCellAt(c).isEmpty());


        do {
            c = myPosition.left();
            if (p.canAddToNextMovements(c)){
                nextMovements = Tool.add(c,nextMovements);
            }
        } while (board.contains(c) && board.getCellAt(c).isEmpty());


        do {
            c = myPosition.right();
            if (p.canAddToNextMovements(c)){
                nextMovements = Tool.add(c,nextMovements);
            }
        } while (board.contains(c) && board.getCellAt(c).isEmpty());

        return nextMovements;



    }
}
