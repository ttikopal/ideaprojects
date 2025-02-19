package Ejercicio3;

public class Refrigerado extends Producto{

    private int codigo;

    public Refrigerado(String fechaCaducidad, int numeroLote, String informacion, int codigo) {
        super(fechaCaducidad, numeroLote, informacion);
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCodigo: " + codigo;
    }
}
