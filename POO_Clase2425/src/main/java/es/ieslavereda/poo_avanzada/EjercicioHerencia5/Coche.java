package es.ieslavereda.poo_avanzada.EjercicioHerencia5;

public class Coche {

    private String matricula;
    private String marca;
    private String modelo;

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula +
                "\nMarca: " + marca +
                "\nModelo: " + modelo;
    }
}
