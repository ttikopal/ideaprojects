package org.example;

public class Triangulo extends Figura{

    public Triangulo(double longitud){
        super(3);
        this.longitud = longitud;
    }

    public double obtenerArea(){

        double altura = (Math.sqrt(3) / 2) * longitud;
        return (longitud * altura)/2;
    }


}
