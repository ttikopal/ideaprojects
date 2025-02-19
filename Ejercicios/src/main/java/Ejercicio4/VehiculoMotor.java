package Ejercicio4;

public abstract class VehiculoMotor extends Vehiculo{

    private String tipoMotor;
    private int numeroMarchas;

    public VehiculoMotor(float velocidad, String tipoMotor, int numeroMarchas){
        super(velocidad);
        this.tipoMotor = tipoMotor;
        this.numeroMarchas = numeroMarchas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Motor: " + tipoMotor +
                "\nNumero de marchas: " + numeroMarchas;
    }
}
