package es.ieslavereda.Bingo;

public class Celda implements Comparable<Celda> {


    private Integer valor;
    private boolean marcada;

    public Celda(Integer valor){
        this.valor = valor;
        this.marcada = false;
    }

    public void marcar(Bola b){
        if(b.getValue() == valor){
            marcar();
        }
    }

    public void marcar(){
        this.marcada = true;
    }

    public boolean isMarcada(){
        return marcada;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Celda)) return false;

        Celda c = (Celda) obj;
        return valor == c.valor;
    }

    @Override
    public String toString() {
        return valor + " " + marcada;
    }

    @Override
    public int compareTo(Celda o) {
        return valor-o.valor;
    }
}
