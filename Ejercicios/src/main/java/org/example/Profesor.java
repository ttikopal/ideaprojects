package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Profesor extends Persona{

    private Grado[] gradosImparte;

    public Profesor(String dni, String nombre, String apellidos, int edad, Grado... gradosImparte){
        super(dni, nombre, apellidos, edad);
        this.gradosImparte = gradosImparte;

    }

    public void setGradosImparte(Grado... gradosImparte) {
        this.gradosImparte = gradosImparte;
    }

    public Grado[] getGradosImparte() {

        return gradosImparte;

    }

    public void printDni(){
        System.out.println("Profesor DNI: " + getDni());
    }

    @Override
    public String toString() {
        return super.toString() + "\nGrados que imparte: " + Arrays.toString(gradosImparte);
    }
}
