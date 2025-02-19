package es.ieslavereda;

public class Poligono {

    private Line[] lineas;

    public Poligono(Line... lineas){

        this.lineas = lineas;

    }

    public void moverArriba(int c){
        for(Line l : lineas)
            l.moveLine(c);
    }

    public double obtenerPerimetro(){
        double perimetro = 0;
        for (Line l : lineas)
            perimetro+=l.getLongitud();
        return perimetro;
    }

}
