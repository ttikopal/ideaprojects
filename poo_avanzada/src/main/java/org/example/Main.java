package org.example;

public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Jose", "Palomo", "3123123123");
        Profesor profesor = new Profesor("Carlos", "Lopez","2342342342");

        Persona[] personas = new Persona[]{
                alumno,
                profesor
        };

        for (Persona p : personas) System.out.println(p);

        Cuadrado c = new Cuadrado(56);
        Triangulo t = new Triangulo(98);
        System.out.println(c.obtenerArea());
        System.out.println(t.obtenerArea());

    }
}