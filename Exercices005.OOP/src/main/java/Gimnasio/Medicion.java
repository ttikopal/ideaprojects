package Gimnasio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Medicion {

    private LocalDate fecha;
    private float peso;
    private float altura;
    private Cliente cliente;

    public Medicion(LocalDate fecha,float peso, float altura, Cliente cliente){
        this.fecha = fecha;
        this.peso = peso;
        this.altura = altura;
        this.cliente = cliente;
    }

    private float calcularImc(){
        return peso/(altura*altura);
    }

    private String calcularRangos(){
        String aux = "";

        if (calcularImc() < 18.5){
            aux += "Bajo peso";
        } else if (calcularImc() < 24.99){
            aux += "Rango normal";
        } else if (calcularImc() < 29.99){
            aux += "Sobrepeso";
        } else aux += "Obeso";

        return aux;
    }

    private float calcularTmb(){
        float aux;
        int s;
        if (cliente.getSexo() == Sexo.Hombre){
            s = 5;
        } else {
            s = -161;
        }
        aux = 10 * peso + 6.25f * altura -5 * cliente.calcularEdad() + s;

        return aux;
    }


    private double calcularGrasa(){




        double aux = -44.988 + (0.503 * cliente.calcularEdad())
                + (10.689 * 0)
                + (3.172 * calcularImc())
                - (0.026 * (calcularImc() * calcularImc()))
                + (0.181 * calcularImc() * 0)
                - (0.02 * calcularImc() * cliente.calcularEdad())
                - (0.005 * Math.pow(calcularImc(), 2) * 0)
                + (0.00021 * Math.pow(calcularImc(), 2) * cliente.calcularEdad());

        return aux;
    }

    private String calcularRangosGrasa(){

        String aux = "";

        if (cliente.getSexo() == Sexo.Hombre){
            if (calcularGrasa() < 2){
                aux += "Grasa escasa";
            } else if (calcularGrasa() < 5) {
                aux += "Grasa esencial";
            } else if (calcularGrasa() < 13) {
                aux += "Deportistas";
            } else if (calcularGrasa() < 17) {
                aux += "Fitnes";
            } else if (calcularGrasa() < 24) {
                aux += "Promedio";
            } else {
                aux += "Obesos";
            }
        } else {
            if (calcularGrasa() < 10){
                aux += "Grasa escasa";
            } else if (calcularGrasa() < 13) {
                aux += "Grasa esencial";
            } else if (calcularGrasa() < 20) {
                aux += "Deportistas";
            } else if (calcularGrasa() < 24) {
                aux += "Fitnes";
            } else if (calcularGrasa() < 31) {
                aux += "Promedio";
            } else {
                aux += "Obesos";
            }
        }
        return aux;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "\nEn el día " + fecha + " tiene peso: " + peso + " el peso ajustado es: " + "" +
                "\nsu IMC esá en el rango de " + calcularRangos() +
                "\ny su rango de grasa corporal en grasa en nivel "+calcularRangosGrasa() +
                "\nfinalmente su tasa metabólica basal es de: " + calcularTmb() + "kcal/dia\n";
    }
}
