package es.ieslavereda.Bingo;

public class Bola {

    private int value;


    public Bola(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Bola " + value;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null) return false;

        if(!(obj instanceof Bola)) return false;

        Bola b = (Bola) obj;

        return value == b.value;
    }
}
