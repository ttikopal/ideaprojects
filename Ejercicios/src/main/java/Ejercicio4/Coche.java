package Ejercicio4;

public class Coche extends VehiculoMotor{

    private String matricula;

    public Coche(float velocidad, String tipoMotor, int numeroMarchas, String matricula) {
        super(velocidad, tipoMotor, numeroMarchas);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return  super.toString() + "Coche{" +
                "matricula='" + matricula;
    }
}
