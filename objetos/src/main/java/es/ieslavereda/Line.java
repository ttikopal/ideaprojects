package es.ieslavereda;

public class Line {

    private Point start;
    private Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public void moveLine(int c){
        start.moveY(c);
        end.moveY(c);
    }

    public double getLongitud(){
        int x = start.getX() - end.getX();
        int y = start.getY() - end.getY();
         return Math.sqrt(Math.pow(y,2) + Math.pow(x,2));
    }

    @Override
    public String toString() {
        return start + "-------" + end;
    }
}
