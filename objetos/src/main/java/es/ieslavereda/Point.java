package es.ieslavereda;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x){
        this.x = x;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public void moveX(int cantidad){
        this.x += cantidad;
    }
    public void moveY(int cantidad){
        this.y += cantidad;
    }

    @Override
    public boolean equals(Object obj){

        if (obj == null) return false;
        if(!(obj instanceof Point)) return false;

        Point p = (Point) obj;

        return p.getX() == this.x && p.getY() == this.y;
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
