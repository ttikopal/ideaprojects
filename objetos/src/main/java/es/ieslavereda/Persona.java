package es.ieslavereda;

public class Persona {

    //Atributos o campos
    private float altura;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor
    public Persona(float altura,String nombre,String apellidos,int edad){

        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.apellidos = apellidos;

    }

    // Métodos

    // getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }


    //setters
    public void setEdad(int edad){
        if (edad>0 && edad<120)
            this.edad = edad;
    }
    public void setAltura(float altura){
        if (altura>0 && altura<2.5)
            this.altura = altura;
    }

    //funcionales

    public void cumplirAnyo(){
        edad++;
    }

    public String toString(){
        return "Persona: " + nombre + " " + apellidos + " " + edad + " " + altura;
    }
}
