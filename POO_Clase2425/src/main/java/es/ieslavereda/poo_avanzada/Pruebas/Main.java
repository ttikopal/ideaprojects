package es.ieslavereda.poo_avanzada.Pruebas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Figura[] figuras = new Figura[]{

                new Circulo(3),
                new Cuadrado(4),
                new TrianguloRectangulo(5)
        };

        System.out.println(Arrays.toString(figuras));








    }
}