package es.ieslavereda.poo_avanzada.Ejercicio3Corregido;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {

    private String codSupervision;

    public ProductoRefrigerado(LocalDate fechaCad, long numLote, String codSupervision){
        super(fechaCad, numLote);

        this.codSupervision = codSupervision;
    }

    public String getCodSupervision(){
        return codSupervision;
    }

    public void setCodSupervision(String codSupervision){
        this.codSupervision = codSupervision;
    }

    @Override

    public String toString(){
        return super.toString() +
                "\nCódigo organismo de supervisión alimentaria: " + codSupervision;
    }

}
