package es.ieslavereda.poo_avanzada.Pruebas;

public class Persona {

    private String nombre;
    private String apellidos;


    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString(){
        return  "Persona\n"+"Nombre: " + apellidos +", " +nombre;
    }
}