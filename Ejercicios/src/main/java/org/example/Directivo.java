package org.example;

public class Directivo extends Profesor{

    private String cargo;

    public Directivo(String dni, String nombre, String apellidos, int edad, Grado gradosImparte, String cargo){
        super(dni, nombre, apellidos, edad, gradosImparte);
        this.cargo = cargo;
    }


    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void printDni(){
        System.out.println("Directivo DNI: "+getDni());
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: " + cargo;
    }
}
