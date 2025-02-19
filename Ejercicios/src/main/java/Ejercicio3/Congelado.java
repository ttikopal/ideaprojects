package Ejercicio3;

public class Congelado extends Producto{

    private int temperatura;

    public Congelado(String fechaCaducidad, int numeroLote, String informacion, int temperatura) {
        super(fechaCaducidad, numeroLote, informacion);
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTemperatura: " + temperatura + "ºC";
    }
}
