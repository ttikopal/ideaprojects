package es.ieslavereda.poo_avanzada.EjercicioHerencia3;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {

    private int codSupervision;

    public ProductoRefrigerado(LocalDate fechaCad, int numLote, int codSupervision){
        super(fechaCad, numLote);

        this.codSupervision = codSupervision;
    }

    public int getCodSupervision(){
        return codSupervision;
    }

    public void setCodSupervision(int codSupervision){
        this.codSupervision = codSupervision;
    }

    @Override

    public String toString(){
        return super.toString() +
                "\nCódigo organismo de supervisión alimentaria: " + codSupervision;
    }

}
