package es.ieslavereda.poo_avanzada.EjercicioHerencia1;

import java.util.Arrays;

public class Profesor extends Persona{

    private Grado[] gradosImparte;

    public Profesor(String DNI, String nombre, String apellidos, int edad, Grado... gradosImparte) {
        super(DNI, nombre, apellidos, edad);
        this.gradosImparte = gradosImparte;
    }

    public Grado[] getGradosImparte(){
        return gradosImparte;
    }

    public void setGradosImparte(Grado... grados){
        this.gradosImparte = grados;
    }

    @Override
    public void imprimirDNI() {
        System.out.println("Profesor DNI: " + getDNI());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", grados: " + Arrays.toString(gradosImparte);
    }
}
