package es.ieslavereda.poo_avanzada.Ejercicio3Corregido;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {

    private int tempCongelacion;

    public ProductoCongelado(LocalDate fechaCad, long numLote, int tempCongelacion){
        super(fechaCad, numLote);

        this.tempCongelacion = tempCongelacion;
    }

    public int getTempCongelacion(){
        return tempCongelacion;
    }

    public void setTempCongelacion(int tempCongelacion){
        this.tempCongelacion = tempCongelacion;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nTemperatura recomendada: " + tempCongelacion;
    }

}
