package es.ieslavereda.poo_avanzada.EjercicioHerencia1;

public class Alumno extends Persona {

    private String NIA;
    private Grado grado;

    public Alumno(String DNI, String nombre, String apellidos, int edad, String NIA, Grado grado) {
        super(DNI, nombre, apellidos, edad);
        this.NIA = (NIA==null)?generarNIA():NIA;
        this.grado = grado;
    }

    public Alumno(String DNI, String nombre, String apellidos, int edad, Grado grado) {
        super(DNI, nombre, apellidos, edad);
        this.grado = grado;
        this.NIA = generarNIA();
    }

    private String generarNIA(){
        return String.valueOf((long)(Math.random()*100000000));
    }

    @Override
    public void imprimirDNI() {

        System.out.println("Alumno DNI: " + getDNI());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", NIA: " + NIA + ", " +
                "Grado: " + grado;
    }
}
