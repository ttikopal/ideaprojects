package Gimnasio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente {

    private String nombre;
    private LocalDate fechanac;
    private String dni;
    private Sexo sexo;
    private float altura;
    private Medicion[] mediciones;

    public Cliente(String nombre, LocalDate fechanac, String dni, Sexo sexo, int altura) {
        this.nombre = nombre;
        this.fechanac = fechanac;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        mediciones = new Medicion[0];
    }

    public Medicion[] getMediciones(){
        return mediciones;
    }

    public LocalDate getFechanac(){
        return fechanac;
    }

    public void pesarse(Medicion peso){
        Medicion[] aux = new Medicion[this.mediciones.length+1];
        for (int i = 0; i<this.mediciones.length; i++){
            aux[i] = mediciones[i];
        }
        aux[aux.length-1] = peso;
            mediciones = aux;
    }

    public Sexo getSexo(){
        return sexo;
    }

    public int calcularEdad(){
        return (int) ChronoUnit.YEARS.between(getFechanac(), LocalDate.now());
    }

    @Override
    public String toString() {

        String aux = "";

        aux += "Nombre: " + nombre + "\nFecha de nacimiento: " + fechanac +
                "\nEdad: " + calcularEdad() + "\nDni: " + dni + "\nSexo: " + sexo + "\nAltura: " + altura +
                "\n";
        if (mediciones.length == 0) {
            aux += "\núltimo peso: sin peso registrado aún\n";
        } else {
            for (Medicion medicion : mediciones){
                aux += medicion.toString();
                aux += "\n";
            }
        }
        return aux;
    }

    @Override
    public boolean equals(Object obj) {
        return this.dni.equals(dni);
    }
}
