package Ejercicio3;

public class Frescos extends Producto{

    private String fechaEnvasado;
    private String paisOrigen;

    public Frescos(String fechaCaducidad, int numeroLote, String informacion, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote, informacion);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFecha Envasado: " + fechaEnvasado +
                "\nPais de origen: " + paisOrigen;
    }
}
