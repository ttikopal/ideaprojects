package org.example;

import java.util.Random;

public class Alumno extends Persona {

    private int nia;
    private String grado;

    public Alumno(String dni, String nombre, String apellidos, int edad, int nia){
        super(dni, nombre, apellidos, edad);
        this.nia = nia;
    }
    public Alumno(String dni, String nombre, String apellidos, int edad, String grado){
        super(dni, nombre, apellidos, edad);
        Random random = new Random();
        this.nia = 10000000 + random.nextInt(90000000);;
        this.grado = grado;
    }

    @Override
    public void printDni() {
        System.out.println("Alumno DNI: " + getDni());
    }

    @Override
    public String toString() {
        return super.toString() + "NIA: " + nia +
                "\nGrado: " + grado;
    }
}