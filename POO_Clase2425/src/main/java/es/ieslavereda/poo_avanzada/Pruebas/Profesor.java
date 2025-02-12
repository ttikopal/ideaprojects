package es.ieslavereda.poo_avanzada.Pruebas;

public class Profesor extends Persona{

    private String dni;

    public Profesor(String nombre, String apellidos,String dni) {
        super(nombre, apellidos);
        this.dni=dni;
    }


    @Override
    public String toString(){
        return super.toString()+"\n"+
                "Profesor\n"+
                "DNI: " + dni;
    }

}