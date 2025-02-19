package Ejercicio5;

public class Coche {

    private String matricula;
    private String marca;
    private String modelo;

    public Coche(String modelo, String marca, String matricula) {
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
