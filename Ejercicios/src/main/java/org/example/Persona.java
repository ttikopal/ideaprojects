package org.example;

public abstract class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void cumplirAnyos() {
        edad = edad + 1;
    }

    public abstract void printDni();

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nEdad: " + edad +
                "\nDNI: " + dni;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona p = (Persona) obj;
        return dni.equals(p.dni);
    }
}
