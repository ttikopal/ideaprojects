import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Board {

    private Map<Coordinate,Cell> cells;

    public Board(){
        cells = new HashMap<>();

        for (int row=1;row<=8;row++)
            for(char col='A';col<='H';col++)
                cells.put(new Coordinate(col,row),new Cell(this,new Coordinate(col,row)));

    }
    public boolean contains(Coordinate c) {
        return cells.containsKey(c);
    }
    public Cell getCellAt(Coordinate c) {
        return cells.get(c);
    }

    public void highLight(Collection<Coordinate> coordinates){
        for (Coordinate c : coordinates)
            getCellAt(c).highlight();
    }

    public void removeHighlight(){
        for (Cell c : cells.values())
            c.removeHighLight();
    }


    @Override
    public String toString() {
        String aux="    A  B  C  D  E  F  G  H\n";

        for (int row=1;row<=8;row++) {
            aux += " " + row + " ";
            for (char col = 'A'; col <= 'H'; col++){
                aux +=  getCellAt(new Coordinate(col,row));
            }
            aux += " "+row + "\n";
        }
        aux+="    A  B  C  D  E  F  G  H";
        return aux;
    }
}
