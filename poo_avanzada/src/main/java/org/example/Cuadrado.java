package org.example;

public class Cuadrado extends Figura{

    public Cuadrado(double longitud){
        super(4);
        this.longitud = longitud;
    }

    public double obtenerArea(){
        return longitud * longitud;
    }

}
